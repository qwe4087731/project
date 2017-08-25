package org.phoenix.encrypt;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

/**
 * 字节数组和16进制字符串的转换
 * 
 * @author Dev2
 * 
 */
public class HexUtils {
	// hex负责把2进制转换成16进制
	private final static Hex hex = new Hex();

	/*
	 * 把字节数组转换成字符串，如new byte[11100100, 10111000, 10101101],首先转换成对应的十六进制字节数组即new
	 * byte[0xe4,0xb8,0xad]，之后转换成字符串"e4b8ad"
	 */
	public static String encode(byte[] bytes) {
		return new String(hex.encode(bytes));
	}

	/*
	 * 参数必须是十六进制字符串，如字符串"e4b8ad",转换成字节数组对应的十六进制是new
	 * byte[0xe4,0xb8,0xad],二进制是[11100100, 10111000, 10101101]
	 */
	public static byte[] decode(String data) throws DecoderException {
		return hex.decode(data.getBytes());
	}

	public static void main(String[] args) throws Exception {
		String str = "中";
		String abc = HexUtils.encode(str.getBytes());
		System.out.println(abc);
		byte[] d = HexUtils.decode(abc);
		System.out.println(new String(d));
	}

}
