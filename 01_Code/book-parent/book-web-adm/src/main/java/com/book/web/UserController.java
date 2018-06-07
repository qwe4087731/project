package com.book.web;

import org.json.JSONArray;
import org.json.JSONObject;
import org.phoenix.common.util.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
	private static Logger logger = LoggerFactory
			.getLogger(UserController.class);

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public JSONArray login(@RequestBody String requestBody) {
		JSONObject jsonObject = JsonUtils.parseJSONObject(requestBody);
		JSONArray array = new JSONArray();
		if (jsonObject == null) {
			array.put(0);
			array.put("参数错误");
			return array;
		}
		logger.info("jsonObject:" + jsonObject);
		array.put(1);
		array.put("");
		array.put("token");
		return array;
	}
	
	@RequestMapping(value = "/info", method = RequestMethod.POST)
	public JSONArray info() {
		JSONObject jsonObject = JsonUtils.parseJSONObject(null);
		JSONArray array = new JSONArray();
		if (jsonObject == null) {
			array.put(0);
			array.put("参数错误");
			return array;
		}
		logger.info("jsonObject:" + jsonObject);
		array.put(1);
		array.put("");
		array.put("token");
		return array;
	}

}
