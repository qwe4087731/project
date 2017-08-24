package com.iguan.dao;

import com.iguan.entity.model.SettingCmwLngType;
import com.iguan.entity.model.SettingCmwLngTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettingCmwLngTypeMapper {
    long countByExample(SettingCmwLngTypeExample example);

    int deleteByExample(SettingCmwLngTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SettingCmwLngType record);

    int insertSelective(SettingCmwLngType record);

    List<SettingCmwLngType> selectByExample(SettingCmwLngTypeExample example);

    SettingCmwLngType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SettingCmwLngType record, @Param("example") SettingCmwLngTypeExample example);

    int updateByExample(@Param("record") SettingCmwLngType record, @Param("example") SettingCmwLngTypeExample example);

    int updateByPrimaryKeySelective(SettingCmwLngType record);

    int updateByPrimaryKey(SettingCmwLngType record);
}