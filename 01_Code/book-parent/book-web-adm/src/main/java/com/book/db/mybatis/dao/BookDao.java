package com.book.db.mybatis.dao;

import org.phoenix.mybatis.dao.BaseDao;
import org.springframework.stereotype.Repository;

import com.book.db.mybatis.bean.BookDO;

@Repository
public interface BookDao extends BaseDao<BookDO> {
}