package org.phoenix.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.phoenix.mybatis.criterion.CountCriterion;
import org.phoenix.mybatis.criterion.DeleteCriterion;
import org.phoenix.mybatis.criterion.SelectCriterion;
import org.phoenix.mybatis.criterion.UpdateCriterion;

public interface BaseDao<T> {
	int deleteByPrimaryKey(Integer id);

	int insert(T t);

	T selectByPrimaryKey(Integer id);

	List<T> selectAll();

	int updateByPrimaryKey(T t);

	List<T> selectByCriterion(SelectCriterion criterion);

	int countByCriterion(CountCriterion criterion);

	int updateByCriterion(@Param("record") T t,
			@Param("criterion") UpdateCriterion criterion);

	int deleteByCriterion(DeleteCriterion criterion);
}
