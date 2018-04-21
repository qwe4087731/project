package com.smart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.db.mybatis.bean.UserInfo;
import com.smart.db.mybatis.dao.UserInfoDao;

@Service
public class UserInfoService {
	private UserInfoDao userInfoDao;

	@Autowired
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}

	public UserInfo getUserInfo() {
		UserInfo userInfo = userInfoDao.selectByPrimaryKey(2);
		return userInfo;
	}

}
