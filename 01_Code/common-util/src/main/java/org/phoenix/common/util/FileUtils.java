package org.phoenix.common.util;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.phoenix.common.constant.CharSetConst;

public class FileUtils {
	public static final String FILE_SEPARATOR = System
			.getProperty("file.separator");
	private static Logger logger = Logger.getLogger(FileUtils.class);

	public static Map<String, String> readMapFromFile(String fileName,
			String encoder) throws Exception {
		Map<String, String> map = new LinkedHashMap<String, String>();
		try {
			List<String> lines = readLines(fileName, encoder);
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
						.append(FILE_SEPARATOR);
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
			List<String> lines = readLines(fileName, encoder);
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
				buf.append(line).append(FILE_SEPARATOR);
			}
			if (buf.length() > 0) {
				writeDataToFile(filepath, buf.toString(), encoder, append);
			}
		}
	}

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
