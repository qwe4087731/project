package com.iguan.controller.base;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.google.gson.Gson;
import com.iguan.param.CurrencyParam;
import com.iguan.result.IGResult;
import com.iguan.result.IGResultCode;
import com.iguan.util.des.DES3Util;
import com.iguan.util.md5.MD5Util;

/**
 * 公共controller
 * @author miaoxy
 *
 */
public class BaseController {
	
	public static final int VERSION_01 = 1;
	
	
	
	public final Gson gson = new Gson();
	
	/**
	 * 获取body内容解密，封装后返回
	 * @param request
	 * @return
	 */
	public CurrencyParam decryptBodyIOJson(HttpServletRequest request) {
		CurrencyParam fromJson = null;
		String body = null;
		try {
			ByteArrayOutputStream bab = new ByteArrayOutputStream();
			InputStream in = request.getInputStream();
			byte[] b = new byte[1024];
			int len = -1;
			while((len = in.read(b)) != -1) {
				bab.write(b, 0, len);
			}
			byte[] bodyByte = bab.toByteArray();
			if(bodyByte == null || bodyByte.length == 0) {
				return null;
			}
			System.out.println(Arrays.toString(bodyByte));
			System.out.println(bodyByte.length);
			byte[] decryptMode = DES3Util.decryptMode(DES3Util.DEFAULT_3DES_KEY, bodyByte);
			System.out.println(Arrays.toString(decryptMode));
			body  = new String(decryptMode);
			fromJson = gson.fromJson(body, CurrencyParam.class);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return fromJson;
	}
	
	/**
	 * 校验数据完整性
	 * @param param
	 * @return
	 */
	public boolean isSign(CurrencyParam param) {
		try {
			if(param == null) {
				return false;
			}
			String sign = param.getSign();
			if(sign == null) {
				return false;
			}
			StringBuffer sb = new StringBuffer();
			sb.append(param.getSn());
			sb.append(param.getV());
			sb.append(param.getData());
			if(sign.toUpperCase().equals(MD5Util.MD5(sb.toString()).toUpperCase())) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
	
	
	
	
	/**
	 * 错误JSON返回
	 * @param code
	 * @param message
	 * @return
	 */
	public String error(int code, String message) {
		IGResult result = new IGResult(code, message);
		return gson.toJson(result);
	}
	
	/**
	 * 成功返回
	 * @param code
	 * @param message
	 * @return
	 */
	public String success() {
		IGResult result = new IGResult(IGResultCode.RESULT_CODE_SUCCESS, "success");
		return gson.toJson(result);
	}
	
	/**
	 * 返回相关数据
	 * @param result
	 * @return
	 */
	public String toResult(IGResult result) {
		return gson.toJson(result);
	}
}
