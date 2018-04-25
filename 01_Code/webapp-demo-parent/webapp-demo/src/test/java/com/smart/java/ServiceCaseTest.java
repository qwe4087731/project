package com.smart.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.smart.db.mybatis.bean.UserInfoDO;
import com.smart.service.UserInfoService;

@ContextConfiguration("classpath*:/spring/smart-context.xml")
public class ServiceCaseTest extends AbstractTransactionalTestNGSpringContextTests {
	@Autowired
	private UserInfoService userInfoService;

	@Test
	public void testAddLoginLog() {
		UserInfoDO userInfo = userInfoService.getUserInfo();
		Assert.assertEquals(userInfo.getUserName(), "lisi");
		Assert.assertTrue(userInfo.getDisabled());

	}

	@Test
	public void testAddLoginLog1() {
		List<UserInfoDO> userInfoList = userInfoService.listUserInfo();
		Assert.assertEquals(userInfoList.size(), 2);
	}

}
