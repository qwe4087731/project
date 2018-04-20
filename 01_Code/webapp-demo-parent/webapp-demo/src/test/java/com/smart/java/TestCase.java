package com.smart.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.smart.db.mybatis.bean.UserInfo;
import com.smart.db.mybatis.dao.UserInfoDao;


@ContextConfiguration("classpath*:/applicationContext.xml")
public class TestCase extends AbstractTransactionalTestNGSpringContextTests {

	@Autowired
	private UserInfoDao userInfoDao;

	@Test
	public void testAddLoginLog() {
		UserInfo userInfo = userInfoDao.selectByPrimaryKey(2);
		System.out.println(userInfo.getUserName());
	}
}
