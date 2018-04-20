package com.smart.user.db.mybatis.dao;

import org.phoenix.mybatis.dao.BaseDao;
import org.springframework.stereotype.Repository;

import com.smart.user.db.mybatis.bean.UserInfo;

@Repository
public interface UserInfoDao extends BaseDao<UserInfo> {
}