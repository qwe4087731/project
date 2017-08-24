package com.iguan.param;
/**
 * 通用param
 * @author miaoxy
 *
 */
public class CurrencyParam {
	
	private String sn;//设备序列号
	private Integer v;//接口版本
	private String data;//JSON数据信息
	private String sign;//校验数据完整性
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public Integer getV() {
		return v;
	}
	public void setV(Integer v) {
		this.v = v;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	@Override
	public String toString() {
		return "CurrencyParam [sn=" + sn + ", v=" + v + ", data=" + data + ", sign=" + sign + "]";
	}

	
	
	
	
}
