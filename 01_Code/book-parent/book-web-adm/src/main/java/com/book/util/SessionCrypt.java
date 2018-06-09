package com.book.util;

import org.phoenix.encrypt.AESCoderUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionCrypt {
	private static Logger logger = LoggerFactory.getLogger(SessionCrypt.class);
	private static final String key = "Gg6W&b^2";
	private static AESCoderUtils aesCoder = null;

	static {
		initSessionCrypt();
	}

	private static void initSessionCrypt() {
		try {
			aesCoder = new AESCoderUtils(key);
		} catch (Exception e) {
			logger.error("init SessionCrypt failed", e);
		}
	}

	public static String encrypt(String data) {
		if (data == null) {
			return null;
		}

		String encryptData = null;
		try {
			encryptData = aesCoder.encrypt(data);
		} catch (Exception e) {
			logger.error("encrypt data failed:" + data, e);
		}
		return encryptData;
	}

	public static String decrypt(String data) {
		if (data == null) {
			return null;
		}
		String decryptData = null;
		try {
			decryptData = aesCoder.decrypt(data);
		} catch (Exception e) {
			logger.error("decrypt data failed:" + data, e);
		}
		return decryptData;
	}

}
