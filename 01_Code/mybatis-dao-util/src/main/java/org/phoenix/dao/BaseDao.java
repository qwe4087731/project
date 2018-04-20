package org.phoenix.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.phoenix.criterion.CountCriterion;
import org.phoenix.criterion.DeleteCriterion;
import org.phoenix.criterion.SelectCriterion;
import org.phoenix.criterion.UpdateCriterion;

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
