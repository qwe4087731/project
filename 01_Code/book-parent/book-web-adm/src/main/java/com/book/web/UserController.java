package com.book.web;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.phoenix.common.util.JsonUtils;
import org.phoenix.common.util.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.book.db.mybatis.bean.UserDO;
import com.book.service.UserService;
import com.book.util.SessionCrypt;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
	private static Logger logger = LoggerFactory
			.getLogger(UserController.class);
	private UserService userServcie;

	public UserService getUserServcie() {
		return userServcie;
	}

	@Autowired
	public void setUserServcie(UserService userServcie) {
		this.userServcie = userServcie;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public JSONArray login(@RequestBody String requestBody) {
		JSONObject jsonObject = JsonUtils.parseJSONObject(requestBody);
		JSONArray array = new JSONArray();
		if (jsonObject == null) {
			array.put(0);
			array.put("参数错误");
			return array;
		}
		if (logger.isInfoEnabled()) {
			logger.info("login jsonObject:" + jsonObject);
		}
		String username = jsonObject.optString("username", "");
		String password = jsonObject.optString("password", "");
		if (username.equals("admin") && password.equals("admin")) {
			String token = SessionCrypt.encrypt("1");
			array.put(1);
			array.put("");
			array.put(token);
		} else {
			array.put(0);
			array.put("账号密码不正确");
		}
		return array;
	}

	@RequestMapping(value = "/info", method = RequestMethod.POST)
	public JSONArray info(
			@CookieValue(value = "token", required = false) String encryptToken) {
		String token = SessionCrypt.decrypt(encryptToken);
		JSONArray array = new JSONArray();
		if (token == null) {
			array.put(-1);
			array.put("账号信息有误");
			return array;
		}

		int userId = NumberUtils.str2Int(token);
		if (userId <= 0) {
			logger.error("get userinfo token error:" + token);
			array.put(-1);
			array.put("账号信息有误");
			return array;
		}
		UserDO userDO = userServcie.getUserInfo(userId);
		if (userDO == null) {
			logger.error("user not exist:" + userId);
			array.put(-1);
			array.put("账号信息有误");
			return array;
		}
		array.put(1);
		array.put("");
		// JSONObject userJSON = new JSONObject();
		// userJSON.put("name", userDO.getName());
		// userJSON.put("img", userDO.getImgId());
		// array.put(userJSON);
		array.put(userDO.getName());
		return array;
	}
}
