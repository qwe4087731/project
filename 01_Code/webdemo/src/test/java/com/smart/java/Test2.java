package com.smart.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.smart.user.db.mybatis.bean.UserInfo;
import com.smart.user.db.mybatis.dao.UserInfoDao;

@ContextConfiguration("classpath*:/applicationContext.xml")
public class Test2 extends AbstractTransactionalTestNGSpringContextTests {

	@Autowired
	private UserInfoDao userInfoDao;

	@Test
	public void testAddLoginLog() {
		UserInfo userInfo = userInfoDao.selectByPrimaryKey(1);
		userInfo.setUserName("admin");
	}
}
