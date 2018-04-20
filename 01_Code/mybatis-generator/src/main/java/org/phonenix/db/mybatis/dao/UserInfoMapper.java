package org.phonenix.db.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.phoenix.mybatis.criterion.CountCriterion;
import org.phoenix.mybatis.criterion.DeleteCriterion;
import org.phoenix.mybatis.criterion.SelectCriterion;
import org.phoenix.mybatis.criterion.UpdateCriterion;
import org.phonenix.db.mybatis.bean.UserInfo;

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