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
	
	
	/**
	 * 测试
	 * 
	 * @param args
	 * @author SHANHY
	 * @date 2015-8-18
	 */
	public static void main(String[] args) {
		// 添加新安全算法,如果用JCE就要把它添加进去
		Security.addProvider(new com.sun.crypto.provider.SunJCE());

		// 24字节的密钥（我们可以取apk签名的指纹的前12个byte和后12个byte拼接在一起为我们的密钥）
//		final byte[] keyBytes = { 0x11, 0x22, 0x4F, 0x58, (byte) 0x88, 0x10, 0x40, 0x38, 0x28, 0x25, 0x79, 0x51,
//				(byte) 0xCB, (byte) 0xDD, 0x55, 0x66, 0x77, 0x29, 0x74, (byte) 0x98, 0x30, 0x40, 0x36, (byte) 0xE2 };
//		[-27, -122, -96, 46, -28, -71, -119, 38, -25, -89, -111, 42, -26, -118, -128, 64, -26, -100, -119, 126, -23, -103, -112, 96]
		final byte[] keyBytes = toByteKeys("冠.义&科*技@有~限`");
		
		String szSrc = "This is a 3DES test. 测试";
		
		System.out.println(Arrays.toString(keyBytes));
		
		System.out.println("加密前的字符串:" + szSrc);

		byte[] encoded = encryptMode(keyBytes, szSrc.getBytes());
		System.out.println("加密后的字符串:" + new String(encoded));

		byte[] srcBytes = decryptMode(keyBytes, encoded);
		System.out.println("解密后的字符串:" + (new String(srcBytes)));

//		post("http://localhost:8080/TestWeb3.0/DesTestServlet", encoded);
		// http://localhost:8080/TestWeb3.0/

	}
	
	
	
	
	
	
	
	
	
}
