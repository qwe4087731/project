package com.smart.db.mybatis.dao;

import com.smart.db.mybatis.bean.UserInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.phoenix.mybatis.generate.Criterion.CountCriterion;
import org.phoenix.mybatis.generate.Criterion.DeleteCriterion;
import org.phoenix.mybatis.generate.Criterion.SelectCriterion;
import org.phoenix.mybatis.generate.Criterion.UpdateCriterion;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userId);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> selectByCriterion(SelectCriterion criterion);

    int countByCriterion(CountCriterion criterion);

    int updateByCriterion(@Param("record") UserInfo record, @Param("criterion") UpdateCriterion criterion);

    int deleteByCriterion(DeleteCriterion criterion);
}