package com.smart.db.mybatis.dao;

import org.phoenix.mybatis.generate.dao.BaseDao;
import org.springframework.stereotype.Repository;

import com.smart.db.mybatis.bean.UserInfo;

@Repository("userInfoDao")
public interface UserInfoMapper extends BaseDao<UserInfo> {
}