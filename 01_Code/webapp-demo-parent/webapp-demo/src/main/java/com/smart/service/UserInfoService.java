package com.smart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.db.mybatis.bean.UserInfoDO;
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

	public UserInfoDO getUserInfo() {
		UserInfoDO userInfo = userInfoDao.getByPrimaryKey(2);
		return userInfo;
	}

}
