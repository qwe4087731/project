package org.phoenix.common.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

public class FileUtils {
	public static final String file_separator = System
			.getProperty("file.separator");

	public static String[] readDataArrayFromFile(String fileName, String encoder)
			throws Exception {
		String contents = readDataFromFile(fileName, encoder);
		return contents.split("[\r\n]+");
	}

	public static String readDataFromFile(String filepath, String encoder)
			throws Exception {
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(filepath));
			return StreamUtils.stream2str(bis, encoder);
		} finally {
			StreamUtils.closeStream(bis);
		}
	}

	public static void writeDataToFile(String filepath, String data,
			boolean append) throws Exception {
		writeDataToFile(filepath, data, "utf-8", append);
	}

	public static void writeDataToFile(String filepath, String data,
			String charset, boolean append) throws Exception {
		writeByteToFile(filepath, data.getBytes(charset), append);
	}

	private static void writeByteToFile(String filepath, byte[] bytes,
			boolean append) throws Exception {
		File file = new File(filepath);
		File p = file.getParentFile();
		if (!p.exists()) {
			p.mkdirs();
		}
		if (!append) {
			file.delete();
		}

		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(filepath, "rw");
			if (append) {
				raf.seek(raf.length());
			}
			raf.write(bytes);
		} finally {
			StreamUtils.closeStream(raf);
		}
	}

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
