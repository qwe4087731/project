package com.smart.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smart.db.mybatis.bean.UserInfo;
import com.smart.db.mybatis.dao.UserInfoMapper;

public class Test1 {
	// 生成对应mybatis-generate代码，复制进工程，因为没有生成对应的Dao类，所以自己添加一个Dao类
	// 比如新增UserInfoDao，它需要添加注解@Repository("userInfoDao")，以及需要继承BaseDao<UserInfo>。
	// 同时修改mapper.xml文件
	public static void main(String[] args) {
		String configPath = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		UserInfoMapper userInfoDao = (UserInfoMapper) ctx
				.getBean("userInfoDao");
		System.out.println(userInfoDao.getClass());
		UserInfo userInfo = userInfoDao.selectByPrimaryKey(1);
		System.out.println(userInfo.getUserName());
		userInfo.setUserName("qq1234");

		// UpdateCriterion update = new UpdateCriterion();
		// update.addOrWhereClauses(new WhereClauses()).addWhereClause(
		// new WhereClause(UserInfo.USER_NAME, "=", "zhangsan"));

		userInfoDao.updateByPrimaryKey(userInfo);
		System.out.println(userInfo.getUserName());
	}
}
