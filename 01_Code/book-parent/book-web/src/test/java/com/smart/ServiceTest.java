package com.smart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.book.db.mybatis.bean.UserDO;
import com.smart.service.UserService;

@ContextConfiguration("classpath*:/spring/smart-context.xml")
public class ServiceTest extends AbstractTransactionalTestNGSpringContextTests {
//	@Autowired
//	private UserService userInfoService;
//
//	@Test
//	public void testAddLoginLog() {
//		UserDO userInfo = userInfoService.getUserInfo();
//		Assert.assertEquals(userInfo.getName(), "zhangsan");
//		// Assert.assertTrue(userInfo.get());
//
//	}
//
//	@Test
//	public void testAddLoginLog1() {
//		List<UserDO> userInfoList = userInfoService.listUserInfo();
//		Assert.assertEquals(userInfoList.size(), 2);
//	}

}
