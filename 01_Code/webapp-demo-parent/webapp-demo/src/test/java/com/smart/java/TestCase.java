package com.smart.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.smart.db.mybatis.bean.UserInfo;
import com.smart.db.mybatis.service.UserInfoService;

@ContextConfiguration("classpath*:/applicationContext.xml")
public class TestCase extends AbstractTransactionalTestNGSpringContextTests {
	@Autowired
	private UserInfoService userInfoService;

	@Test
	public void testAddLoginLog() {
		UserInfo userInfo = userInfoService.getUserInfo();
		Assert.assertEquals(userInfo.getUserName(), "lisi");

	}
}
