package com.iguan.result;
/**
 * IGResult状态码
 * @author miaoxy
 *
 */
public interface IGResultCode {
	
	/**
	 * 执行成功
	 */
	public static final int RESULT_CODE_SUCCESS = 100;
	
	/**
	 * 执行异常
	 */
	public static final int RESULT_CODE_ERROR = 101;
	
	/**
	 * 数据不能为空
	 */
	public static final int RESULT_CODE_ERROR_NOT_NULL = 102;
	
	/**
	 * 数据校验不一致
	 */
	public static final int RESULT_CODE_ERROR_SIGN = 103;
	
	/**
	 * 没有必要的数据信息
	 */
	public static final int RESULT_CODE_NO_NECESSARY = 104;
	
	/**
	 * 数据信息错误
	 */
	public static final int RESULT_CODE_ERROR_PARAM_DATA = 105;
	
	
}
