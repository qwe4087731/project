package org.phoenix.common.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

public class FileUtils {
	public static final String file_separator = System
			.getProperty("file.separator");
	private static Logger logger = Logger.getLogger(FileUtils.class);

	public static Map<String, String> readMapFromFile(String fileName,
			String encoder) throws Exception {
		Map<String, String> map = new LinkedHashMap<String, String>();
		try {
			String[] lines = readDataArrayFromFile(fileName, encoder);
			for (String line : lines) {
				String[] values = line.split("=");
				map.put(values[0], values[1]);
			}
		} catch (Exception e) {
			logger.error("read map from file failed", e);
		}
		return map;
	}

	public static void writeMapToFile(String filepath, Map<String, String> map,
			String encoder, boolean append) throws Exception {
		if (map != null) {
			StringBuilder buf = new StringBuilder();
			for (Map.Entry<String, String> entry : map.entrySet()) {
				buf.append(entry.getKey()).append("=").append(entry.getValue())
						.append(file_separator);
			}
			if (buf.length() > 0) {
				writeDataToFile(filepath, buf.toString(), encoder, append);
			}
		}
	}

	public static Set<String> readSetFromFile(String fileName, String encoder)
			throws Exception {
		Set<String> set = new LinkedHashSet<String>();
		try {
			String[] lines = readDataArrayFromFile(fileName, encoder);
			for (String line : lines) {
				set.add(line);
			}
		} catch (Exception e) {
			logger.error("read set from file failed", e);
		}
		return set;
	}

	public static void writeSetToFile(String filepath, Set<String> set,
			String encoder, boolean append) throws Exception {
		if (set != null) {
			StringBuilder buf = new StringBuilder();
			for (String line : set) {
				buf.append(line).append(file_separator);
			}
			if (buf.length() > 0) {
				writeDataToFile(filepath, buf.toString(), encoder, append);
			}
		}
	}

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

	public static void writeByteToFile(String filepath, byte[] bytes,
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
