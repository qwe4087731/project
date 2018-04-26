package org.phoenix.encrypt;

import java.security.MessageDigest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单向加密
 * 
 * @author Dev2
 * 
 */
public class MessageDigestUtils {
	private static final Logger logger = LoggerFactory.getLogger(MessageDigestUtils.class);

	public final static MessageDigestUtils instance = new MessageDigestUtils();
	public MessageDigest md5Digest = null;

	public MessageDigestUtils getInstance() {
		return instance;
	}

	public MessageDigestUtils() {
		try {
			md5Digest = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			logger.error("md5 init failed", e);
		}
	}

	// 计算字符串的字节数组的信息摘要，并以16进制字符串返回
	public String encderMD5(String data) {
		byte[] bytes = md5Digest.digest(data.getBytes());
		return HexUtils.encode(bytes);
	}

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		time += 1000 * 60 * 60 * 24 * 30;
		String oid = "passwd" + ":" + time + ":" + "abc123";
		String str = MessageDigestUtils.instance.encderMD5(oid);
		System.out.println(str);

	}
}
