package org.phoenix.common.util;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.log4j.Logger;
import org.phoenix.common.constant.CharSetConst;

public class FileUtils {
	public static final String FILE_SEPARATOR = System
			.getProperty("file.separator");
	public static final String LINE_SEPARATOR = System
			.getProperty("line.separator");
	private static Logger logger = Logger.getLogger(FileUtils.class);

	public static List<String> readLinesFromFile(String filepath, String encoder)
			throws Exception {
		File file = new File(filepath);
		if (!file.exists()) {
			return null;
		}
		List<String> lines = org.apache.commons.io.FileUtils.readLines(
				new File(filepath), encoder);
		return lines;
	}

	public static String readDataFromFile(String filepath, String encoder)
			throws Exception {
		File file = new File(filepath);
		if (!file.exists()) {
			return null;
		}
		return org.apache.commons.io.FileUtils.readFileToString(new File(
				filepath), encoder);
	}

	public static void writeDataToFile(String filepath, String data,
			boolean append) throws Exception {
		writeDataToFile(filepath, data, CharSetConst.UTF_8, append);
	}

	public static void writeDataToFile(String filepath, String data,
			String charset, boolean append) throws Exception {
		org.apache.commons.io.FileUtils.writeStringToFile(new File(filepath),
				data, charset, append);
	}

	public static <K, V> Map<K, V> readMapFromFile(String filepath,
			String encoder, Class<K> K, Class<V> V) throws Exception {
		return readMapFromFile(filepath, encoder, false, K, V);
	}

	public static <K, V> Map<K, V> readMapFromFile(String filepath,
			String encoder, boolean order, Class<K> K, Class<V> V)
			throws Exception {
		Map<K, V> map = order ? new LinkedHashMap<K, V>() : new HashMap<K, V>();
		List<String> lines = readLinesFromFile(filepath, encoder);
		if (lines != null) {
			try {
				for (String line : lines) {
					String[] values = line.split("=");
					String k = values[0];
					String v = null;
					if (values.length == 2) {
						v = values[1];
					} else {
						String tmp = "";
						for (int i = 1; i < values.length; i++) {
							tmp += values[i]
									+ (i == values.length - 1 ? "" : "=");
						}
						v = tmp;
					}
					K key = (K) StrictConvertUtils.getInstance().convert(k, K);
					V value = (V) StrictConvertUtils.getInstance()
							.convert(v, V);
					map.put(key, value);
				}
			} catch (Exception e) {
				logger.error("file is illegal map", e);
				throw e;
			}
		}
		return map;
	}

	private static class StrictConvertUtils extends ConvertUtilsBean {
		private static StrictConvertUtils INSTANCE = new StrictConvertUtils();

		private StrictConvertUtils() {
			register(true, true, 0);
		}

		public static StrictConvertUtils getInstance() {
			return INSTANCE;
		}
	}

	public static void writeMapToFile(String filepath, Map<?, ?> map,
			String encoder, boolean append) throws Exception {
		if (map != null) {
			StringBuilder buf = new StringBuilder();
			for (Map.Entry<?, ?> entry : map.entrySet()) {
				buf.append(entry.getKey()).append("=").append(entry.getValue())
						.append(LINE_SEPARATOR);
			}
			if (buf.length() > 0) {
				writeDataToFile(filepath, buf.toString(), encoder, append);
			}
		}
	}

	public static <T> Set<T> readSetFromFile(String filepath, String encoder,
			Class<T> T) throws Exception {
		return readSetFromFile(filepath, encoder, false, T);
	}

	public static <T> Set<T> readSetFromFile(String filepath, String encoder,
			boolean order, Class<T> T) throws Exception {
		Set<T> set = order ? new LinkedHashSet<T>() : new HashSet<T>();
		List<String> lines = readLinesFromFile(filepath, encoder);
		if (lines != null) {
			try {
				for (String line : lines) {
					T t = (T) StrictConvertUtils.getInstance().convert(line, T);
					set.add(t);
				}
			} catch (Exception e) {
				logger.error("file is illegal set", e);
				throw e;
			}
		}
		return set;
	}

	public static void writeSetToFile(String filepath, Set<String> set,
			String encoder, boolean append) throws Exception {
		if (set != null) {
			StringBuilder buf = new StringBuilder();
			for (String line : set) {
				buf.append(line).append(LINE_SEPARATOR);
			}
			if (buf.length() > 0) {
				writeDataToFile(filepath, buf.toString(), encoder, append);
			}
		}
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

	public static void main(String[] args) throws Exception {
		// List<String> lines = readLines("C:\\Users\\qz\\Desktop\\1.txt",
		// "utf-8");
		// for (String line : lines) {
		// System.out.println(line);
		// }

		// System.out.println(System.getProperty("path.separator"));

		// String line = readFileToString("C:\\Users\\qz\\Desktop\\1.txt",
		// "utf-8");
		// System.out.println(line);

		// writeDataToFile("C:\\Users\\qz\\Desktop\\hello\\world\\1.txt",
		// "helloworld", true);

		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "123");
		map.put("2", "123=45");
		String filepath = "C:\\Users\\qz\\Desktop\\hello\\1.txt";
		writeMapToFile("C:\\Users\\qz\\Desktop\\hello\\1.txt", map, "utf-8",
				false);
		Map<Integer, String> newMap = readMapFromFile(filepath, "utf-8",
				Integer.class, String.class);
		for (Integer key : newMap.keySet()) {
			System.out.println(key + "=" + newMap.get(key));
		}
	}
}
