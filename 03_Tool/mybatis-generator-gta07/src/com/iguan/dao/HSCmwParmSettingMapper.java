package com.iguan.dao;

import com.iguan.entity.model.HSCmwParmSetting;
import com.iguan.entity.model.HSCmwParmSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HSCmwParmSettingMapper {
    long countByExample(HSCmwParmSettingExample example);

    int deleteByExample(HSCmwParmSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HSCmwParmSetting record);

    int insertSelective(HSCmwParmSetting record);

    List<HSCmwParmSetting> selectByExample(HSCmwParmSettingExample example);

    HSCmwParmSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HSCmwParmSetting record, @Param("example") HSCmwParmSettingExample example);

    int updateByExample(@Param("record") HSCmwParmSetting record, @Param("example") HSCmwParmSettingExample example);

    int updateByPrimaryKeySelective(HSCmwParmSetting record);

    int updateByPrimaryKey(HSCmwParmSetting record);
}