package com.smart.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.smart.db.mybatis.bean.UserInfoDO;
import com.smart.service.UserInfoService;

@ContextConfiguration("classpath*:/spring/smart-context.xml")
public class ServiceCase extends AbstractTransactionalTestNGSpringContextTests {
	@Autowired
	private UserInfoService userInfoService;

	@Test
	public void testAddLoginLog() {
		UserInfoDO userInfo = userInfoService.getUserInfo();
		Assert.assertEquals(userInfo.getUserName(), "zhangsan");
		Assert.assertFalse(userInfo.getDisabled());

	}
}
