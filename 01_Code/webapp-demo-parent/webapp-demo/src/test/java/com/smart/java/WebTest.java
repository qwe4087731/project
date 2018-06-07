package com.smart.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.phoenix.common.util.HttpUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.xstream.XStreamMarshaller;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.smart.db.mybatis.bean.UserDO;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class WebTest {
	// @Test
	// public void testhandle41() {
	// RestTemplate restTemplate = new RestTemplate();
	// MultiValueMap<String, String> form = new LinkedMultiValueMap<String,
	// String>();
	// form.add("userName", "tom");
	// form.add("password", "123456");
	// form.add("age", "45");
	// URI postForLocation =
	// restTemplate.postForLocation("http://localhost:8080/smart/user/handle41.html",
	// form);
	// System.out.println(postForLocation.toString());
	// }
	//
	// @Test
	// public void testhandle42() throws IOException {
	// RestTemplate restTemplate = new RestTemplate();
	// byte[] response =
	// restTemplate.postForObject("http://localhost:8080/smart/user/handle42/{itemId}.html",
	// null,
	// byte[].class, "1233");
	// Resource outFile = new
	// FileSystemResource("C:\\Users\\Dev2\\Desktop\\3.mp4");
	// FileCopyUtils.copy(response, outFile.getFile());
	// }
	//
	// @Test
	// public void testhandle43() {
	// RestTemplate restTemplate = new RestTemplate();
	// MultiValueMap<String, String> form = new LinkedMultiValueMap<String,
	// String>();
	// form.add("userName", "tom");
	// form.add("password", "123456");
	// form.add("age", "45");
	// restTemplate.postForLocation("http://localhost:8080/chapter17/user/handle43.html",
	// form);
	// }

	public static void main(String[] args) throws Exception {
		if (true) {
			HashMap<String, String> headMap = new HashMap<String, String>();
			headMap.put("Accept", "application/xml");
			headMap.put("Content-Type", "application/xml");
			Map<String, String> bodyMap = new HashMap<String, String>();
			// bodyMap.put(", value);
			HttpUtils.postData("http://localhost:8080/smart/user/handle51.html", "utf-8", headMap, bodyMap);
			return;
		}
	}

	@Test
	public void testhandle51WithXml() {

		RestTemplate restTemplate = buildRestTemplate();

		UserDO user = new UserDO();
		user.setName("tom");
		user.setImgId(12);

		HttpHeaders entityHeaders = new HttpHeaders();
		entityHeaders.setContentType(MediaType.valueOf("application/json"));
		entityHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<UserDO> requestEntity = new HttpEntity<UserDO>(user, entityHeaders);

		ResponseEntity<UserDO> responseEntity = restTemplate.exchange("http://localhost:8080/smart/user/handle51.html",
				HttpMethod.POST, requestEntity, UserDO.class);

		UserDO responseUser = responseEntity.getBody();
		Assert.assertNotNull(responseUser);
		Assert.assertEquals(1000, (int) responseUser.getId());
		Assert.assertEquals("tom1", responseUser.getName());
	}

	private RestTemplate buildRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();

		// ①创建MarshallingHttpMessageConverter
		XStreamMarshaller xmlMarshaller = new XStreamMarshaller();
		xmlMarshaller.setStreamDriver(new StaxDriver());
		xmlMarshaller.setAnnotatedClasses(new Class[] { UserDO.class });

		MarshallingHttpMessageConverter xmlConverter = new MarshallingHttpMessageConverter();
		xmlConverter.setMarshaller(xmlMarshaller);
		xmlConverter.setUnmarshaller(xmlMarshaller);
		restTemplate.getMessageConverters().add(xmlConverter);

		// ②创建MappingJacksonHttpMessageConverter
		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		restTemplate.getMessageConverters().add(jsonConverter);
		return restTemplate;
	}
}
