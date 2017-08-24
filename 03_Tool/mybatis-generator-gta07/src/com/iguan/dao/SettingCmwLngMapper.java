package com.iguan.dao;

import com.iguan.entity.model.SettingCmwLng;
import com.iguan.entity.model.SettingCmwLngExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettingCmwLngMapper {
    long countByExample(SettingCmwLngExample example);

    int deleteByExample(SettingCmwLngExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SettingCmwLng record);

    int insertSelective(SettingCmwLng record);

    List<SettingCmwLng> selectByExample(SettingCmwLngExample example);

    SettingCmwLng selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SettingCmwLng record, @Param("example") SettingCmwLngExample example);

    int updateByExample(@Param("record") SettingCmwLng record, @Param("example") SettingCmwLngExample example);

    int updateByPrimaryKeySelective(SettingCmwLng record);

    int updateByPrimaryKey(SettingCmwLng record);
}