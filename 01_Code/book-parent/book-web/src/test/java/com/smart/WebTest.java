package com.smart;

import java.io.IOException;
import java.net.URI;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

public class WebTest {
	@Test
	public void testhandle41() {
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<String, String> form = new LinkedMultiValueMap<String, String>();
		form.add("userName", "tom");
		form.add("password", "123456");
		form.add("age", "45");
		URI postForLocation = restTemplate.postForLocation("http://localhost:8080/smart/user/handle41.html", form);
		System.out.println(postForLocation.toString());
	}

	@Test
	public void testhandle42() throws IOException {
		RestTemplate restTemplate = new RestTemplate();
		byte[] response = restTemplate.postForObject("http://localhost:8080/smart/user/handle42/{itemId}.html", null,
				byte[].class, "1233");
		Resource outFile = new FileSystemResource("C:\\Users\\Dev2\\Desktop\\3.mp4");
		FileCopyUtils.copy(response, outFile.getFile());
	}

	@Test
	public void testhandle43() {
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<String, String> form = new LinkedMultiValueMap<String, String>();
		form.add("userName", "tom");
		form.add("password", "123456");
		form.add("age", "45");
		restTemplate.postForLocation("http://localhost:8080/chapter17/user/handle43.html", form);
	}

	// @Test
	// public void testhandle44() throws IOException {
	// RestTemplate restTemplate = new RestTemplate();
	// byte[] response =
	// restTemplate.postForObject("http://localhost:8080/chapter17/user/handle44/{itemId}.html",
	// null, byte[].class, "1233");
	// Resource outFile = new FileSystemResource("d:/image_copy.jpg");
	// FileCopyUtils.copy(response, outFile.getFile());
	// }
}
