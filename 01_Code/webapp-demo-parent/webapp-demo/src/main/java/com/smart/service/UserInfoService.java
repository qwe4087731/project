package com.smart.service;

import java.util.List;

import org.phoenix.db.SqlConst;
import org.phoenix.mybatis.criterion.SelectCriterion;
import org.phoenix.mybatis.criterion.WhereClauses;
import org.phoenix.mybatis.criterion.WhereClauses.WhereClause;
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

	public List<UserInfoDO> listUserInfo() {
		SelectCriterion select = new SelectCriterion();
		WhereClauses whereClauses = new WhereClauses();
		whereClauses.addWhereClause(new WhereClause(UserInfoDO.IS_DISABLED,
				SqlConst.EQUAL, true));
		select.addOrWhereClauses(whereClauses);
		return userInfoDao.listByCriterion(select);
	}
}
