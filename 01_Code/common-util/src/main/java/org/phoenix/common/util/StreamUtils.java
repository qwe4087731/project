package org.phoenix.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamUtils {
	private static final Logger logger = LoggerFactory.getLogger(StreamUtils.class);
	private static final int DEFAULT_BUFFER_SIZE = 1024;

	public static String stream2str(InputStream is, String encoder) throws Exception {
		ByteArrayOutputStream bos = null;
		String data = null;
		try {
			bos = new ByteArrayOutputStream();
			is2os(is, bos);
			data = bos.toString(encoder);
		} finally {
			closeStream(bos);
			closeStream(is);
		}
		return data;
	}

	public static void is2os(InputStream bis, OutputStream bos) throws Exception {
		byte[] buf = new byte[DEFAULT_BUFFER_SIZE];
		while (true) {
			int b = bis.read(buf, 0, DEFAULT_BUFFER_SIZE);
			if (b == -1)
				break;
			bos.write(buf, 0, b);
		}
	}

	public static void closeStream(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (IOException e) {
				logger.error("close stream error", e);
			}
		}
	}
}
