package com.smart.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	// private UserDao userDao;
	//
	// @Autowired
	// public void setUserInfoDao(UserDao userDao) {
	// this.userDao = userDao;
	// }
	//
	// public UserDao getUserInfoDao() {
	// return userDao;
	// }
	//
	// public UserDO getUserInfo() {
	// UserDO user = userDao.getByPrimaryKey(1);
	// return user;
	// }
	//
	// public List<UserDO> listUserInfo() {
	// SelectCriterion select = new SelectCriterion();
	// WhereClauses whereClauses = new WhereClauses();
	// whereClauses.addWhereClause(new WhereClause(UserDO.NAME,
	// SqlConst.EQUAL, "zhangsan"));
	// select.addOrWhereClauses(whereClauses);
	// return userDao.listByCriterion(select);
	// }
}
