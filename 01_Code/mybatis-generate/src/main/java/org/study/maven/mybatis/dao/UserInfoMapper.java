package org.study.maven.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.study.maven.mybatis.CountCriterion;
import org.study.maven.mybatis.DeleteCriterion;
import org.study.maven.mybatis.SelectCriterion;
import org.study.maven.mybatis.UpdateCriterion;
import org.study.maven.mybatis.bean.UserInfo;
import org.study.maven.mybatis.bean.UserInfoExample;

public interface UserInfoMapper {
    int countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> selectByCriterion(SelectCriterion criterion);

    int countByCriterion(CountCriterion criterion);

    int updateByCriterion(@Param("record") UserInfo record, @Param("criterion") UpdateCriterion criterion);

    int deleteByCriterion(DeleteCriterion criterion);
}