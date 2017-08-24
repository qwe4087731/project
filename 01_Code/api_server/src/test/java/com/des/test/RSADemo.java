package com.des.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public class RSADemo {
	public RSADemo() {
	}

	/**
	 * 生成 RSA公钥私钥
	 * 
	 * user miao xinyang
	 * Create 2017 2017年7月3日 下午5:41:42
	 */
	public static void generateKey() {
		try {
			KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
			kpg.initialize(1024);
			KeyPair kp = kpg.genKeyPair();
			PublicKey pbkey = kp.getPublic();
			PrivateKey prkey = kp.getPrivate();
			// 保存公钥
			FileOutputStream f1 = new FileOutputStream("pubkey.dat");
			ObjectOutputStream b1 = new ObjectOutputStream(f1);
			b1.writeObject(pbkey);
			// 保存私钥
			FileOutputStream f2 = new FileOutputStream("privatekey.dat");
			ObjectOutputStream b2 = new ObjectOutputStream(f2);
			b2.writeObject(prkey);
		} catch (Exception e) {
		}
	}

	/**
	 * 公钥加密
	 * @throws Exception
	 * user miao xinyang
	 * Create 2017 2017年7月3日 下午5:42:04
	 */
	public static void encrypt() throws Exception {
		String s = "Hello World!";
		// 获取公钥及参数e,n
		FileInputStream f = new FileInputStream("pubkey.dat");
		ObjectInputStream b = new ObjectInputStream(f);
		RSAPublicKey pbk = (RSAPublicKey) b.readObject();
		BigInteger e = pbk.getPublicExponent();
		BigInteger n = pbk.getModulus();
		System.out.println("e= " + e);
		System.out.println("n= " + n);
		// 获取明文m
		byte ptext[] = s.getBytes("UTF-8");
		BigInteger m = new BigInteger(ptext);
		// 计算密文c
		BigInteger c = m.modPow(e, n);
		System.out.println("c= " + c);
		// 保存密文
		String cs = c.toString();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("encrypt.dat")));
		out.write(cs, 0, cs.length());
		out.close();
	}
	
	/**
	 * 私钥解密
	 * @throws Exception
	 * user miao xinyang
	 * Create 2017 2017年7月3日 下午5:42:19
	 */
	public static void decrypt() throws Exception {
		// 读取密文
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream("encrypt.dat")));
		String ctext = in.readLine();
		BigInteger c = new BigInteger(ctext);
		// 读取私钥
		FileInputStream f = new FileInputStream("privatekey.dat");
		ObjectInputStream b = new ObjectInputStream(f);
		RSAPrivateKey prk = (RSAPrivateKey) b.readObject();
		BigInteger d = prk.getPrivateExponent();
		// 获取私钥参数及解密
		BigInteger n = prk.getModulus();
		System.out.println("d= " + d);
		System.out.println("n= " + n);
		BigInteger m = c.modPow(d, n);
		// 显示解密结果
		System.out.println("m= " + m);
		byte[] mt = m.toByteArray();
		System.out.println("PlainText is ");
		for (int i = 0; i < mt.length; i++) {
			System.out.print((char) mt[i]);
		}
	}
	
	
	public static void main(String args[]) {
		try {
			generateKey();
			encrypt();
			decrypt();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}