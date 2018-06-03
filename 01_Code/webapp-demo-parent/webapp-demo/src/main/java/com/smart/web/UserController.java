package com.smart.web;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smart.db.mybatis.bean.UserDO;

//1.必须加CrossOrigin
@CrossOrigin
@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger logger = LoggerFactory
			.getLogger(UserController.class);

	@RequestMapping("/register")
	public String register() {
		return "user/register";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String createUser(UserDO userDo) {
		logger.info("name:" + userDo.getName());
		logger.info("imgId:" + userDo.getImgId());
		return "user/register";
	}

	@RequestMapping(value = "/handle51")
	public ResponseEntity<UserDO> handle51(HttpEntity<UserDO> requestEntity) {
		UserDO user = requestEntity.getBody();
		user.setId(1000);
		return new ResponseEntity<UserDO>(user, HttpStatus.OK);
	}

	// 2.必须加 method=RequestMethod.POST
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public void login(@RequestParam("username") String username,
			@RequestParam("password") String password,
			HttpServletResponse response) {
		// UserDO user = new UserDO();
		// user.setId(1000);
		// user.setName("qz");
		// user.set
		// return new ResponseEntity<UserDO>(user, HttpStatus.OK);
		// Gson
		// os.write(b);

		// response.addHeader("Access-Control-Allow-Origin", "*");
		// response.addHeader("Access-Control-Allow-Headers",
		// "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");
		// response.addHeader("Access-Control-Allow-Methods",
		// "PUT,POST,GET,DELETE,OPTIONS");
		JSONArray array = new JSONArray();
		array.put(1);
		array.put("123");
		array.put(new Token("123"));

		try {
			String result = new ObjectMapper().writeValueAsString(array);
			response.getOutputStream().write(result.getBytes("utf-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 2.必须加 method=RequestMethod.POST
	@RequestMapping(value = "/info", method = RequestMethod.POST)
	@ResponseBody
	public void login(@CookieValue("token") String token,
			HttpServletResponse response) {
		System.out.println("token:" + token);
		JSONArray array = new JSONArray();
		array.put(1);
		array.put("123");
		array.put(new User(1, "qz"));

		try {
			String result = new ObjectMapper().writeValueAsString(array);
			response.getOutputStream().write(result.getBytes("utf-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static class User {
		private String name;
		private int userId;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public User(int userId, String name) {
			this.userId = userId;
			this.name = name;
		}

		public User() {
		}
	}

	public static class Token {
		private String token = null;

		public Token(String token) {
			this.token = token;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public Token() {
		}
	}

	@RequestMapping(value = "/info")
	public ResponseEntity<UserDO> userInfo(HttpEntity<UserDO> requestEntity) {
		UserDO user = requestEntity.getBody();
		user.setId(1000);
		return new ResponseEntity<UserDO>(user, HttpStatus.OK);
	}

}
