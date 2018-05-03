package com.smart.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smart.db.mybatis.bean.UserDO;

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

}
