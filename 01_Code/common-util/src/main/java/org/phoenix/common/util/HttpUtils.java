package org.phoenix.common.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicNameValuePair;
import org.phoenix.common.constant.CharSetConsts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//httpclient本来是commons下的一个子项目，后来由于是HTTP相关部分，所以被移到HttpComponents里去了。 
public class HttpUtils {
	private static Logger logger = LoggerFactory.getLogger(HttpUtils.class);

	public static final String USER_AGENT = "User-Agent";
	public static final String REFERER = "Referer";

	public static String BD_SPIDER_USER_AGENT = "Baiduspider+(+http://www.baidu.com/search/spider.htm)";
	public static String GG_SPIDER_USER_AGENT = "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)";

	public static String PC_CHROME_USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36";
	public static String PC_IE_EDGE_USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko";
	public static String PC_FF_USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:41.0) Gecko/20100101 Firefox/41.0";

	// dns找不到不会报连接超时
	// setConnectTimeout是建立与服务器的连接之前的超时,从连接管理器(连接池)请求连接时使用的是ConnectionRequestTimeout
	private static RequestConfig requestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.DEFAULT)
			.setSocketTimeout(5000).setConnectTimeout(3000).setConnectionRequestTimeout(3000).build();
	private static CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(requestConfig).build();

	public static String getData(String url, String encoder) throws Exception {
		return getData(url, encoder, PC_CHROME_USER_AGENT);
	}

	public static String getData(String url, String encoder, String userAgent) throws Exception {
		return getData(url, encoder, userAgent, null);
	}

	public static String getData(String url, String encoder, String userAgent, String referer) throws Exception {
		Map<String, String> headerMap = new HashMap<String, String>();
		if (userAgent != null) {
			headerMap.put(USER_AGENT, userAgent);
		}

		if (referer != null) {
			headerMap.put(REFERER, referer);
		}
		return getData(url, encoder, headerMap);
	}

	public static String getData(String url, String encoder, Map<String, String> headerMap) throws Exception {
		if (logger.isInfoEnabled()) {
			logger.info("HttpUtils get url：" + url);
		}

		// CookieStore cookieStore = new BasicCookieStore();
		// HttpClientContext context = HttpClientContext.create();
		// context.setCookieStore(cookieStore);

		// dns找不到不会报连接超时
		// setConnectTimeout是建立与服务器的连接之前的超时,从连接管理器(连接池)请求连接时使用的是ConnectionRequestTimeout
		// CloseableHttpClient httpClient = HttpClients.custom()
		// .setDefaultCookieStore(cookieStore)
		// .setDefaultRequestConfig(requestConfig).build();

		HttpGet httpGet = new HttpGet(url);
		setHttpHeader(httpGet, headerMap);

		CloseableHttpResponse response = null;
		InputStream is = null;
		try {
			response = httpClient.execute(httpGet);
			is = response.getEntity().getContent();
			return StreamUtils.stream2str(is, encoder).trim();
		} catch (Exception e) {
			logger.error("HttpUtils get url failed：" + url, e);
		} finally {
			StreamUtils.closeStream(is);
			StreamUtils.closeStream(response);
		}
		return null;
	}

	public static void download(String url, String destFile) throws Exception {
		if (logger.isInfoEnabled()) {
			logger.info("HttpUtils download file from url：" + url);
		}

		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse response = null;
		InputStream is = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			response = httpClient.execute(httpGet);
			is = response.getEntity().getContent();
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(new FileOutputStream(destFile));
			StreamUtils.is2os(bis, bos);
		} catch (Exception e) {
			throw e;
		} finally {
			StreamUtils.closeStream(bis);
			StreamUtils.closeStream(is);
			StreamUtils.closeStream(bos);
			StreamUtils.closeStream(response);
		}
	}

	public static String postData(String url, String encoder, HashMap<String, String> headerMap,
			Map<String, String> bodyMap) throws Exception {
		HttpPost httpPost = new HttpPost(url);
		setHttpHeader(httpPost, headerMap);
		setHttpBody(httpPost, bodyMap);

		// CookieStore cookieStore = new BasicCookieStore();
		// HttpClientContext context = HttpClientContext.create();
		// context.setCookieStore(cookieStore);

		CloseableHttpResponse response = null;
		InputStream is = null;
		try {
			response = httpClient.execute(httpPost);
			is = response.getEntity().getContent();
			return StreamUtils.stream2str(is, encoder).trim();

			// List<Cookie> cookies = cookieStore.getCookies();
			// for (int i = 0; i < cookies.size(); i++) {
			// System.out.println("Local cookie: " + cookies.get(i));
			// }
		} catch (Exception e) {
			logger.error("HttpUtils post url failed：" + url, e);
		} finally {
			StreamUtils.closeStream(is);
			StreamUtils.closeStream(response);
		}
		return null;
	}

	/**
	 * 此方法用于先post之后再get的某些场景，比如登录写入cookie之再去读取数据
	 * 
	 * @param url
	 * @param encoder
	 * @param headerMap
	 * @param bodyMap
	 * @return
	 * @throws Exception
	 */
	public static String postAndGetData(String postUrl, String getUrl, String encoder, Map<String, String> headerMap,
			Map<String, String> bodyMap) throws Exception {
		HttpPost httpPost = new HttpPost(postUrl);
		setHttpHeader(httpPost, headerMap);
		setHttpBody(httpPost, bodyMap);

		CookieStore cookieStore = new BasicCookieStore();
		HttpClientContext context = HttpClientContext.create();
		context.setCookieStore(cookieStore);
		CloseableHttpResponse response = httpClient.execute(httpPost, context);
		try {
			// InputStream is = response.getEntity().getContent();
			// StreamUtils.stream2str(is, encoder).trim();
			if (logger.isDebugEnabled()) {
				List<Cookie> cookies = cookieStore.getCookies();
				for (int i = 0; i < cookies.size(); i++) {
					logger.debug("show cookie： " + cookies.get(i));
				}
			}

		} catch (Exception e) {
			logger.error("HttpUtils post failed：" + postUrl, e);
			return null;
		} finally {
			StreamUtils.closeStream(response);
		}

		HttpGet httpGet = new HttpGet(getUrl);
		setHttpHeader(httpPost, headerMap);
		InputStream is = null;
		try {
			response = httpClient.execute(httpGet, context);
			is = response.getEntity().getContent();
			return StreamUtils.stream2str(is, CharSetConsts.UTF_8).trim();
		} catch (Exception e) {
			logger.error("HttpUtils get falied：" + getUrl, e);
		} finally {
			StreamUtils.closeStream(is);
			StreamUtils.closeStream(response);
		}
		return null;
	}

	private static void setHttpHeader(AbstractHttpMessage request, Map<String, String> headerMap) {
		if (headerMap != null) {
			for (Map.Entry<String, String> entry : headerMap.entrySet()) {
				request.setHeader(entry.getKey(), entry.getValue());
			}
		}
	}

	private static void setHttpBody(HttpPost httpPost, Map<String, String> bodyMap) {
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		for (Map.Entry<String, String> entry : bodyMap.entrySet()) {
			formparams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, Consts.UTF_8);
		httpPost.setEntity(entity);
	}

	public static void main(String[] args) throws Exception {
		if (false) {
			Map<String, String> bodyMap = new HashMap<String, String>();

			Map<String, String> headMap = new HashMap<String, String>();
			headMap.put(USER_AGENT, PC_CHROME_USER_AGENT);
			String data = postAndGetData("http://www.tvmao.com/servlet/login",
					"http://adm.tvmao.com/xadmin/drama/drama_query.jsp", CharSetConsts.UTF_8, headMap, bodyMap);
			System.out.println(data);
			System.out.println("=============================");

			data = getData("http://adm.tvmao.com/xadmin/drama/drama_query.jsp", CharSetConsts.UTF_8, headMap);
			System.out.println(data);
			return;
		}
		HashMap<String, String> bodyMap = new HashMap<String, String>();
		bodyMap.put("username", "qwe4087731@126.com");
		bodyMap.put("password", "466284796a");
		bodyMap.put("appid", "on");
		postData("https://kyfw.12306.cn/passport/web/login", "utf-8", null, null);

		String data = getData("http://kyfw.12306.cn/passport/captcha/captcha-image", "utf-8");
		System.out.println(data);
	}
}
