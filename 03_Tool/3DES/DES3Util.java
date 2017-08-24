package com.iguan.util.des;

import java.security.Security;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * 加密算法
 * @author miaoxy
 *
 */
public class DES3Util {
	
	private static final String Algorithm = "DESede"; // 定义 加密算法,可用
													// DES,DESede,Blowfish
	//( 冠.义&科*技@有~限` )
	public static final byte[] DEFAULT_3DES_KEY = new byte[] {
		-27, -122, -96, 46, -28, -71, -119, 38, -25, -89, -111, 42, -26, 
		-118, -128, 64, -26, -100, -119, 126, -23, -103, -112, 96
	};
	
	
	/**
	 * 加密方法
	 * 
	 * @param keybyte
	 *            加密密钥，长度为24字节
	 * @param src
	 *            被加密的数据缓冲区（源）
	 * @return
	 * @author SHANHY
	 * @date 2015-8-18
	 */
	public static byte[] encryptMode(byte[] keybyte, byte[] src) {
		try {
			// 生成密钥
			SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

			// 加密
			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.ENCRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.security.NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} catch (javax.crypto.NoSuchPaddingException e2) {
			e2.printStackTrace();
		} catch (java.lang.Exception e3) {
			e3.printStackTrace();
		}
		return null;
	}

	/**
	 * 解密
	 * 
	 * @param keybyte
	 *            加密密钥，长度为24字节
	 * @param src
	 *            加密后的缓冲区
	 * @return
	 * @author SHANHY
	 * @date 2015-8-18
	 */
	public static byte[] decryptMode(byte[] keybyte, byte[] src) {
		try {
			// 生成密钥
			SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

			// 解密
			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.DECRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.security.NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} catch (javax.crypto.NoSuchPaddingException e2) {
			e2.printStackTrace();
		} catch (java.lang.Exception e3) {
			e3.printStackTrace();
		}
		return null;
	}
	
	
	/**
	 * 转换成十六进制字符串
	 * 
	 * @param b
	 * @return
	 * @author SHANHY
	 * @date 2015-8-18
	 */
	public static String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";

		for (int n = 0; n < b.length; n++) {
			stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
			if (n < b.length - 1)
				hs = hs + ":";
		}
		return hs.toUpperCase();
	}
	
	/**
	 * 根据sign获取解密Byte秘钥
	 * 	解密秘钥是由sign的前24个byte组成
	 * @param sign
	 * @return
	 */
	public static byte[] toByteKeys(String sign) {
		if(sign == null) {
			return null;
		}
		
		byte[] bytes = sign.getBytes();
		System.out.println(bytes.length);
		if(bytes.length < 24) {
			return null;
		}
		byte[] result = new byte[24];
		for(int i = 0; i < 24; i++) {
			result[i] = bytes[i];
		}
		return result;
	}
	
	
	
	
	
	
	
	
}
