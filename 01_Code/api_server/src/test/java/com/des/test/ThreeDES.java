package com.des.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.Security;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.google.gson.Gson;
import com.iguan.param.CurrencyParam;
import com.iguan.param.activate.ActivateParam;
import com.iguan.util.md5.MD5Util;

/**
 * 3DES加密
 * 
 * @author SHANHY(365384722@QQ.COM)
 * @date 2015-8-18
 */
public class ThreeDES {

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
	 * 基本文本 xml json等数据返回格式
	 */
	public static String post(String url, byte[] param) {
		OutputStream out = null;
		BufferedReader in = null;
		StringBuffer sb = new StringBuffer();
		try {
			URL xurl = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) xurl.openConnection();
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			connection.setReadTimeout(10000);
			connection.setDoOutput(true);
			connection.setDoInput(true);

			out = connection.getOutputStream();
			out.write(param);
			out.flush();
			sb.delete(0, sb.length());

			in = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
			if (connection.getResponseCode() == 200) {
				String line = null;
				while ((line = in.readLine()) != null) {
					sb.append(line);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		
		CurrencyParam baseParam = new CurrencyParam();
		baseParam.setSn("SN12345678");
		baseParam.setV(1);
		
		
		
		ActivateParam param = new ActivateParam();
		param.setSn("SN12345678");
		param.setWifiMac("01:21:42:53:32");
		param.setBleMac("11:CA:AB:63:24");
		param.setModel("mo");
		param.setActivateTime(System.currentTimeMillis());
		param.setTypeCode("01");
		
		StringBuffer sb = new StringBuffer();
		sb.append(param.getSn());
		sb.append(param.getWifiMac());
		sb.append(param.getBleMac());
		sb.append(param.getModel());
		sb.append(param.getTypeCode());
		sb.append(param.getActivateTime());
		
		
		
		Gson gson = new Gson();
		String json = gson.toJson(param);
		
		baseParam.setData(json);
		
		String val = baseParam.getSn() + baseParam.getV() + baseParam.getData();
		
		baseParam.setSign(MD5Util.MD5(val));
		String jsons = gson.toJson(baseParam);
		
		System.out.println("加密前的字符串:" + jsons);
		
		byte[] encoded = encryptMode(DEFAULT_3DES_KEY, jsons.getBytes());
		System.out.println("加密后的字符串:" + new String(encoded));
		
		byte[] srcBytes = decryptMode(DEFAULT_3DES_KEY, encoded);
		System.out.println("解密后的字符串:" + (new String(srcBytes)));
		
//		post("http://localhost:8080/TestWeb3.0/DesTestServlet", encoded);
		System.out.println(encoded.length);
		post("http://localhost:8080/api_server/basic/activate.do", encoded);
		
	}
	

	/**
	 * 测试
	 * 
	 * @param args
	 * @author SHANHY
	 * @date 2015-8-18
	 */
	public static void main1(String[] args) {
		// 添加新安全算法,如果用JCE就要把它添加进去
		Security.addProvider(new com.sun.crypto.provider.SunJCE());

		// 24字节的密钥（我们可以取apk签名的指纹的前12个byte和后12个byte拼接在一起为我们的密钥）
//		final byte[] keyBytes = { 0x11, 0x22, 0x4F, 0x58, (byte) 0x88, 0x10, 0x40, 0x38, 0x28, 0x25, 0x79, 0x51,
//				(byte) 0xCB, (byte) 0xDD, 0x55, 0x66, 0x77, 0x29, 0x74, (byte) 0x98, 0x30, 0x40, 0x36, (byte) 0xE2 };
//		CurrencyParam [sn=0123456789ABCDEF, v=1, 
//		data="{"locs":{"accuracy":43.0,"latitude":36.0715,"loc_time":1602,"locationCode":"gaode","longitude":120.434392,"time":1451607581181,"type":"3"},{"accuracy":35.0,"latitude":36.083957,"loc_time":1640,"locationCode":"gaode","longitude":120.393724,"time":1503105986644,"type":"3"},{"accuracy":35.0,"latitude":36.083996,"loc_time":1803,"locationCode":"gaode","longitude":120.393691,"time":1503107608099,"type":"3"},{"accuracy":35.0,"latitude":36.083996,"loc_time":1803,"locationCode":"gaode","longitude":120.393691,"time":1503107608099,"type":"3"},"xlts":{"lngElectricity":0,"lngSourceCode":"cn","lngTargetCode":"en","xltCMWAsrCode":"baidu","xltCMWCode":"baidu","xltCMWTtsCode":"lingyun","xltCreateTime":0,"xltIdentificationTime":3744,"xltSourceContext":"你好我要两杯咖啡","xltSynthesisTime":0,"xltTargetContext":"Hello, I\u0027d like two cups of coffee","xltTranslateTime":447},{"lngElectricity":0,"lngSourceCode":"cn","lngTargetCode":"en","xltCMWAsrCode":"baidu","xltCMWCode":"baidu","xltCMWTtsCode":"lingyun","xltCreateTime":0,"xltIdentificationTime":3526,"xltSourceContext":"你好我要两个芒果","xltSynthesisTime":0,"xltTargetContext":"Hello, I\u0027d like two mangoes","xltTranslateTime":401},{"lngElectricity":0,"lngSourceCode":"cn","lngTargetCode":"en","xltCMWAsrCode":"baidu","xltCMWCode":"baidu","xltCMWTtsCode":"lingyun","xltCreateTime":0,"xltIdentificationTime":3122,"xltSourceContext":"我想吃一个糖","xltSynthesisTime":0,"xltTargetContext":"I\u0027d like to have a candy","xltTranslateTime":375},{"lngElectricity":0,"lngSourceCode":"cn","lngTargetCode":"en","xltCMWAsrCode":"baidu","xltCMWCode":"baidu","xltCMWTtsCode":"lingyun","xltCreateTime":0,"xltIdentificationTime":5607,"xltSourceContext":"啊我要两杯咖啡三个果汁","xltSynthesisTime":0,"xltTargetContext":"Ah, I\u0027d like two cups of coffee and three juice","xltTranslateTime":331},{"lngElectricity":0,"lngSourceCode":"cn","lngTargetCode":"en","xltCMWAsrCode":"baidu","xltCMWCode":"baidu","xltCMWTtsCode":"lingyun","xltCreateTime":0,"xltIdentificationTime":5607,"xltSourceContext":"啊我要两杯咖啡三个果汁","xltSynthesisTime":0,"xltTargetContext":"Ah, I\u0027d like two cups of coffee and three juice","xltTranslateTime":331},{"lngElectricity":0,"lngSourceCode":"cn","lngTargetCode":"en","xltCMWAsrCode":"baidu","xltCMWCode":"baidu","xltCMWTtsCode":"lingyun","xltCreateTime":0,"xltIdentificationTime":3930,"xltSourceContext":"你好我要两杯咖啡三个芒果","xltSynthesisTime":0,"xltTargetContext":"Hello, I\u0027d like two cups of coffee and three mangoes","xltTranslateTime":506},"uploadTime":1503109161759}", sign=3DAC567F70CF22A15CC4A66E85ED0608]
//		CurrencyParam [sn=0123456789ABCDEF, v=1, data="{"locs":[{"accuracy":43.0,"latitude":36.0715,"loc_time":1602,"locationCode":"gaode","longitude":120.434392,"time":1451607581181,"type":"3"},{"accuracy":35.0,"latitude":36.083957,"loc_time":1640,"locationCode":"gaode","longitude":120.393724,"time":1503105986644,"type":"3"},{"accuracy":35.0,"latitude":36.083996,"loc_time":1803,"locationCode":"gaode","longitude":120.393691,"time":1503107608099,"type":"3"},{"accuracy":35.0,"latitude":36.083996,"loc_time":1803,"locationCode":"gaode","longitude":120.393691,"time":1503107608099,"type":"3"}],"xlts":[{"lngElectricity":0,"lngSourceCode":"cn","lngTargetCode":"en","xltCMWAsrCode":"baidu","xltCMWCode":"baidu","xltCMWTtsCode":"lingyun","xltCreateTime":0,"xltIdentificationTime":3744,"xltSourceContext":"你好我要两杯咖啡","xltSynthesisTime":0,"xltTargetContext":"Hello, I\u0027d like two cups of coffee","xltTranslateTime":447},{"lngElectricity":0,"lngSourceCode":"cn","lngTargetCode":"en","xltCMWAsrCode":"baidu","xltCMWCode":"baidu","xltCMWTtsCode":"lingyun","xltCreateTime":0,"xltIdentificationTime":3526,"xltSourceContext":"你好我要两个芒果","xltSynthesisTime":0,"xltTargetContext":"Hello, I\u0027d like two mangoes","xltTranslateTime":401},{"lngElectricity":0,"lngSourceCode":"cn","lngTargetCode":"en","xltCMWAsrCode":"baidu","xltCMWCode":"baidu","xltCMWTtsCode":"lingyun","xltCreateTime":0,"xltIdentificationTime":3122,"xltSourceContext":"我想吃一个糖","xltSynthesisTime":0,"xltTargetContext":"I\u0027d like to have a candy","xltTranslateTime":375},{"lngElectricity":0,"lngSourceCode":"cn","lngTargetCode":"en","xltCMWAsrCode":"baidu","xltCMWCode":"baidu","xltCMWTtsCode":"lingyun","xltCreateTime":0,"xltIdentificationTime":5607,"xltSourceContext":"啊我要两杯咖啡三个果汁","xltSynthesisTime":0,"xltTargetContext":"Ah, I\u0027d like two cups of coffee and three juice","xltTranslateTime":331},{"lngElectricity":0,"lngSourceCode":"cn","lngTargetCode":"en","xltCMWAsrCode":"baidu","xltCMWCode":"baidu","xltCMWTtsCode":"lingyun","xltCreateTime":0,"xltIdentificationTime":5607,"xltSourceContext":"啊我要两杯咖啡三个果汁","xltSynthesisTime":0,"xltTargetContext":"Ah, I\u0027d like two cups of coffee and three juice","xltTranslateTime":331},{"lngElectricity":0,"lngSourceCode":"cn","lngTargetCode":"en","xltCMWAsrCode":"baidu","xltCMWCode":"baidu","xltCMWTtsCode":"lingyun","xltCreateTime":0,"xltIdentificationTime":3930,"xltSourceContext":"你好我要两杯咖啡三个芒果","xltSynthesisTime":0,"xltTargetContext":"Hello, I\u0027d like two cups of coffee and three mangoes","xltTranslateTime":506}],"uploadTime":1503109341767}", sign=048FB6DE79FF71CEC0EE1FCB300509EB]

		
		
		System.out.println(Arrays.toString(DEFAULT_3DES_KEY));
		
		String szSrc = "This is a 3DES test. 测试";
		System.out.println("加密前的字符串:" + szSrc);

		byte[] encoded = encryptMode(DEFAULT_3DES_KEY, szSrc.getBytes());
		System.out.println("加密后的字符串:" + new String(encoded));

		byte[] srcBytes = decryptMode(DEFAULT_3DES_KEY, encoded);
		System.out.println("解密后的字符串:" + (new String(srcBytes)));
		
//		post("http://localhost:8080/TestWeb3.0/DesTestServlet", encoded);
		System.out.println(encoded.length);
		post("http://localhost:8080/api_server/basic/activate.do", encoded);
		
		// http://localhost:8080/TestWeb3.0/
		// http://localhost:8080/api_server/

	}

}