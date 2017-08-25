package org.phoenix.common.util;

import java.io.File;
import java.util.List;

import org.phoenix.common.constant.CharSetConst;

public class FileUtils {
	public static final String file_separator = System
			.getProperty("file.separator");

	public static List<String> readLines(String filepath, String encoder)
			throws Exception {
		List<String> lines = org.apache.commons.io.FileUtils.readLines(
				new File(filepath), encoder);
		return lines;
	}

	public static String readFileToString(String filepath, String encoder)
			throws Exception {
		return org.apache.commons.io.FileUtils.readFileToString(new File(
				filepath), encoder);
	}

	// 写入数据到指定文件
	public static void writeDataToFile(String filepath, String data,
			boolean append) throws Exception {
		writeDataToFile(filepath, data, CharSetConst.UTF_8, append);
	}

	// 写入数据到指定文件
	public static void writeDataToFile(String filepath, String data,
			String charset, boolean append) throws Exception {
		org.apache.commons.io.FileUtils.writeStringToFile(new File(filepath),
				data, charset, append);
	}

	// 写入字节数组到指定文件
	// private static void writeByteToFile(String filepath, byte[] bytes,
	// boolean append) throws Exception {
	// File file = new File(filepath);
	// File p = file.getParentFile();
	// if (!p.exists()) {
	// p.mkdirs();
	// }
	// if (!append) {
	// file.delete();
	// }
	//
	// RandomAccessFile raf = null;
	// try {
	// raf = new RandomAccessFile(filepath, "rw");
	// if (append) {
	// raf.seek(raf.length());
	// }
	// raf.write(bytes);
	// } finally {
	// StreamUtils.closeStream(raf);
	// }
	// }

	public static void copyFile(String srcFile, String destFile)
			throws Exception {
		org.apache.commons.io.FileUtils.copyFile(new File(srcFile), new File(
				destFile));
	}

	// 给定路径如果父目录不存在就创建
	public static void createParentDir(String filePath) {
		File file = new File(filePath);
		createParentDir(file);
	}

	public static void createParentDir(File file) {
		if (!file.getParentFile().exists()) {
			file.mkdirs();
		}
	}
}
