package org.study.maven.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.study.maven.mybatis.CountCriterion;
import org.study.maven.mybatis.DeleteCriterion;
import org.study.maven.mybatis.SelectCriterion;
import org.study.maven.mybatis.UpdateCriterion;
import org.study.maven.mybatis.bean.UserInfo;

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