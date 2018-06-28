package org.phoenix.encrypt;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.phoenix.common.constant.CharSetConsts;

//http://aub.iteye.com/blog/1129339
//http://www.cnblogs.com/shoubianxingchen/p/5869373.html
//http://blog.csdn.net/hbcui1984/article/details/5201247
//http://blog.csdn.net/qq_18870023/article/details/52183755

/*
 * 用于对称加密
 * 首先应该明白AES是基于数据块的加密方式，也就是说，每次处理的数据是一块（16字节），当数据不是16字节的倍数时填充，这就是所谓的分组密码（区别于基于比特位的流密码），16字节是分组长度

 AES支持五种模式：CBC，CFB，ECB，OFB，PCBC，

 jce中实现了三种补码方式：NoPadding，PKCS5Padding，ISO10126Padding;不支持SSL3Padding,不支持“NONE”模式。

 ECB：是一种基础的加密方式，密文被分割成分组长度相等的块（不足补齐），然后单独一个个加密，一个个输出组成密文。
 CBC：是一种循环模式，前一个分组的密文和当前分组的明文异或操作后再加密，这样做的目的是增强破解难度。必须加初始化向量
 CFB/OFB实际上是一种反馈模式，目的也是增强破解的难度。
 ECB和CBC的加密结果是不一样的，两者的模式不同，而且CBC会在第一个密码块运算时加入一个初始化向量。
 * 
 */
public class AESCoderUtils {
	private Cipher enCipher = null;
	private Cipher deCipher = null;

	public AESCoderUtils(String key) throws Exception {
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128, new SecureRandom(key.getBytes()));
		SecretKey secretKey = keyGenerator.generateKey();
		try {
			enCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			deCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			enCipher.init(Cipher.ENCRYPT_MODE, secretKey);
			deCipher.init(Cipher.DECRYPT_MODE, secretKey);
		} catch (Exception e) {
			throw new RuntimeException("init aescoder failed", e);
		}
	}

	private byte[] encrypt(byte[] data) throws Exception {
		return enCipher.doFinal(data);
	}

	private byte[] decrpty(byte[] data) throws Exception {
		return deCipher.doFinal(data);
	}

	// 加密字符串(本质上是加密字符串的字节数组)，得到加密后的字节数组，转换成十六进制字符返回
	public String encrypt(String data) throws Exception {
		byte[] bytes = data.getBytes(CharSetConsts.UTF_8);
		bytes = encrypt(bytes);
		return Base64Utils.encode(bytes, 1).toString();
		// return new String(HexUtils.encode(b));
	}

	// 解密字符串(传递的参数字符串必须是十六进制字符串)，首先把十六进制字符串转换成对应的字节数组，然后对该字节数组解密，得到原始字节数组，还原得到原始字符串
	public String decrypt(String data) throws Exception {
		// HexUtils.decode(data)
		byte[] bytes = Base64Utils.decode(data, 1);
		bytes = decrpty(bytes);
		return new String(bytes, CharSetConsts.UTF_8);
	}

	public static void main(String[] args) throws Exception {
		AESCoderUtils aesCoder = new AESCoderUtils("Gg6W&b^2");
		String str = aesCoder.encrypt("周大生付士大夫举例说");
		String str1 = aesCoder.decrypt(str);
		System.out.println(str);
		System.out.println(str1);
	}
}
