package org.phoenix.common.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.lang3.SystemUtils;
import org.apache.log4j.Logger;

public class ProcessUtils {
	private static Logger logger = Logger.getLogger(ProcessUtils.class);

	public static int exec(String command, StringBuilder outBuf,
			StringBuilder errBuf) {
		return exec(command, outBuf, errBuf, true);
	}

	public static int exec(String command, StringBuilder outBuf,
			StringBuilder errBuf, boolean wait) {
		return exec(command, outBuf, errBuf, wait, null);
	}

	public static int exec(String command, StringBuilder outBuf,
			StringBuilder errBuf, boolean wait, String charset) {
		// for /L %%i in (1,1,100000) do fs 1231 save .bat for test,stdout and
		// stder include
		int retCode = -1;
		StringBuilder cmdBuf = new StringBuilder();
		if (SystemUtils.IS_OS_WINDOWS) {
			cmdBuf.append("cmd.exe /C ");
			cmdBuf.append(command).append(" ");
			if (!wait || outBuf == null && !command.contains(" >")) {
				cmdBuf.append(">NUL ");
			}
			if (!wait || errBuf == null && !command.contains(" 2>")) {
				cmdBuf.append("2>NUL ");
			}
		} else {
			cmdBuf.append("sh -c ");
			cmdBuf.append(command).append(" ");
			if ((!wait || outBuf == null) && !command.contains(" >")) {
				cmdBuf.append(">/dev/null ");
			}
			if ((!wait || errBuf == null) && !command.contains(" 2>")) {
				cmdBuf.append("2>/dev/null ");
			}
		}

		Runtime runtime = Runtime.getRuntime();
		Process p = null;
		StreamReader reader = null;
		try {
			String cmdStr = cmdBuf.toString();
			if (logger.isInfoEnabled()) {
				logger.info("begin exec command：" + cmdStr);
			}

			p = runtime.exec(cmdStr);
			// 非wait模式，会直接返回。而子进程会自己一直执行，直至执行完毕
			if (wait) {
				// 如果仅有标准输出流或者标准错误输出流
				// ，我们只需一直读取标准输出流或者标准错误输出流，直到标准输出流或者标准错误输出流全部读取完成继续往下执行到waitFor方法
				// 此时子进程已经没有标准输出流或者标准错误输出流，虽然没有了标准输出流或者标准错误输出流了，但是子进程如果没执行完成waitFor仍然会阻塞直到执行完成。
				// 所以仅有标准输出流或者标准错误输出流的话此代码一个线程就可以保证永远不会阻塞
				// 但是如果既有标准输出流又有标准错误输出流，虽然标准输出流一直在被读取，但是标准错误输出流没有被读取导致标准错误缓冲区溢出，从而导致子进程执行不下去，此时就没有标准输出产生，而父进程此时读取不到标准输入则会阻塞，于是双方都开始阻塞
				if (outBuf != null && errBuf != null) {
					// 读取执行的进程的输出流，相对于此程序的输入流，所以使用p.getInputStream获取此程序的输入流
					InputStream inputStream = p.getInputStream();
					InputStream errStream = p.getErrorStream();
					reader = new StreamReader(errStream, errBuf, charset);
					reader.start();
					streamToBuf(inputStream, outBuf, charset);
				} else if (outBuf != null) {
					InputStream inputStream = p.getInputStream();
					streamToBuf(inputStream, outBuf, charset);
				} else if (errBuf != null) {
					InputStream errStream = p.getErrorStream();
					streamToBuf(errStream, errBuf, charset);
				}

				// 调用waitFor此时即使子进程的输出全部读取完毕，但是如果它没有执行完仍然会阻塞，直到执行完waitfor方法才会返回
				retCode = p.waitFor();
				if (reader != null) {
					try {
						reader.join(5000);
					} catch (InterruptedException ex) {
						logger.error("exec interrupted", ex);
					}
				}

				if (logger.isInfoEnabled()) {
					logger.info("end exec：" + cmdStr);
				}
			}
		} catch (Exception e) {
			logger.error("exec command：" + command + " error", e);
		} finally {
			if (wait && p != null) {
				p.destroy();
			}
		}

		return retCode;
	}

	private static void streamToBuf(InputStream is, Appendable buf,
			String charset) {
		BufferedReader br = null;
		try {
			InputStreamReader isr = charset == null ? new InputStreamReader(is)
					: new InputStreamReader(is, charset);
			br = new BufferedReader(isr);
			String line = null;
			while ((line = br.readLine()) != null) {
				if (buf != null) {
					buf.append(line).append(FileUtils.LINE_SEPARATOR);
				}
			}
		} catch (Exception ex) {
			logger.error("stream to string buffer error", ex);
			ex.printStackTrace();
		} finally {
			StreamUtils.closeStream(br);
		}
	}

	private static class StreamReader extends Thread {
		final InputStream is;
		final Appendable buf;
		final String charset;

		StreamReader(InputStream is, Appendable buf, String charset) {
			this.is = is;
			this.buf = buf;
			this.charset = charset;
		}

		@Override
		public void run() {
			streamToBuf(is, buf, charset);
		}
	}

	public static void main(String[] args) {
		StringBuilder buf = new StringBuilder();
		StringBuilder errorBuf = new StringBuilder();
		exec("C:\\Users\\qz\\Desktop\\2.bat", buf, errorBuf, true, "gbk");
		System.out.println(buf);
		System.out.println(errorBuf);
	}
}
