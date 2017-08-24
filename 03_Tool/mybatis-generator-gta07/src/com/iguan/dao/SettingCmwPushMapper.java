package com.iguan.dao;

import com.iguan.entity.model.SettingCmwPush;
import com.iguan.entity.model.SettingCmwPushExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettingCmwPushMapper {
    long countByExample(SettingCmwPushExample example);

    int deleteByExample(SettingCmwPushExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SettingCmwPush record);

    int insertSelective(SettingCmwPush record);

    List<SettingCmwPush> selectByExample(SettingCmwPushExample example);

    SettingCmwPush selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SettingCmwPush record, @Param("example") SettingCmwPushExample example);

    int updateByExample(@Param("record") SettingCmwPush record, @Param("example") SettingCmwPushExample example);

    int updateByPrimaryKeySelective(SettingCmwPush record);

    int updateByPrimaryKey(SettingCmwPush record);
}