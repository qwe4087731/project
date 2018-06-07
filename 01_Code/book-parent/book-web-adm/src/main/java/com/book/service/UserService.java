package com.book.service;

import java.util.List;

import org.phoenix.db.SqlConst;
import org.phoenix.mybatis.criterion.SelectCriterion;
import org.phoenix.mybatis.criterion.WhereClauses;
import org.phoenix.mybatis.criterion.WhereClauses.WhereClause;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.db.mybatis.bean.UserDO;
import com.book.db.mybatis.dao.UserDao;

@Service
public class UserService {
	private UserDao userDao;

	@Autowired
	public void setUserInfoDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDao getUserInfoDao() {
		return userDao;
	}

	public UserDO getUserInfo() {
		UserDO user = userDao.getByPrimaryKey(1);
		return user;
	}

	public List<UserDO> listUserInfo() {
		SelectCriterion select = new SelectCriterion();
		WhereClauses whereClauses = new WhereClauses();
		whereClauses.addWhereClause(new WhereClause(UserDO.NAME,
				SqlConst.EQUAL, "zhangsan"));
		select.addOrWhereClauses(whereClauses);
		return userDao.listByCriterion(select);
	}
}
