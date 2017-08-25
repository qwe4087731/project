package org.phoenix.common.util;

import java.io.File;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * 
 * 此类在一个JVM里面获取到锁之后会一直持有锁(直到释放之前)，即使多次调用获取锁。<br/>
 * 如果其它JVM去获取相同文件锁,则会失败。
 * 
 * @author Dev2
 * 
 */
public class JVMLock {
	private final String lockFile;
	private final boolean isShared;
	private FileLock lock = null;
	private FileChannel channel = null;

	private JVMLock(String lockFile, boolean isShared) {
		this.lockFile = lockFile;
		this.isShared = isShared;
	}

	public static <E> JVMLock getExclusiveLock(String lockBasePath, Class<E> c) {
		return getExclusiveLock(lockBasePath + "/" + c.getName() + ".lock");
	}

	public static JVMLock getExclusiveLock(String lockFile) {
		return new JVMLock(lockFile, false);
	}

	public static <E> JVMLock getSharedLock(String lockBasePath, Class<E> c) {
		return getSharedLock(lockBasePath + "/" + c.getName() + ".lock");
	}

	public static JVMLock getSharedLock(String lockFile) {
		return new JVMLock(lockFile, true);
	}

	// lock方法会阻塞
	public synchronized void lock() throws Exception {
		if (isLocked()) {
			return;
		}

		try {
			// 打开文件通道，如果文件不存在则会创建，并且只读，防止channel.lock锁定了文件末尾
			// 然后文件随后又增长，此时增长出来的部分没有锁定，更加通用的方法是lock方法锁定0-Long.MAX_VALUE，可以避免此问题
			channel = FileChannel.open(Paths.get(lockFile),
					StandardOpenOption.CREATE, StandardOpenOption.READ);
			lock = channel.lock(0L, Long.MAX_VALUE, isShared);
		} catch (Exception ex) {
			StreamUtils.closeStream(channel);
			channel = null;
			lock = null;
			throw ex;
		}
	}

	// tryLock不会阻塞，直接返回null
	public synchronized boolean tryLock() throws Exception {
		if (isLocked()) {
			return true;
		}

		try {
			// 打开文件通道，如果文件不存在则会创建，并且只读，防止channel.lock锁定了文件末尾
			// 然后文件随后又增长，此时增长出来的部分没有锁定，更加通用的方法是lock方法锁定0-Long.MAX_VALUE，可以避免此问题

			File file = new File(lockFile);
			FileUtils.createParentDir(file);
			// if (!file.exists()) {
			// file.createNewFile();
			// }

			// 这里需要同时设置StandardOpenOption.CREATE和StandardOpenOption.WRITE才会创建文件，缺一不可
			channel = FileChannel.open(Paths.get(lockFile),
					StandardOpenOption.CREATE, StandardOpenOption.READ,
					StandardOpenOption.WRITE);
			lock = channel.tryLock(0L, Long.MAX_VALUE, isShared);
			return lock != null;
		} catch (Exception ex) {
			StreamUtils.closeStream(channel);
			lock = null;
			channel = null;
			throw ex;
		}
	}

	public synchronized void unlock() throws Exception {
		if (!isLocked()) {
			return;
		}

		lock.release();
		if (channel != null) {
			channel.close();
		}
		lock = null;
		channel = null;
	}

	// 文件锁定对象FileLock最初是有效的。通过调用FileLock.release
	// 方法、关闭用于获取该锁定的通道channel.close()，或者终止 Java
	// 虚拟机（以先到者为准）来释放锁定之前，该对象一直是有效的。可通过调用锁定的 isValid 方法来测试锁定的有效性。
	public synchronized boolean isLocked() {
		return lock != null && lock.isValid();
	}
}
