package com.iguan.dao;

import com.iguan.entity.model.CHBasicInfoLngAsrSetting;
import com.iguan.entity.model.CHBasicInfoLngAsrSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CHBasicInfoLngAsrSettingMapper {
    long countByExample(CHBasicInfoLngAsrSettingExample example);

    int deleteByExample(CHBasicInfoLngAsrSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CHBasicInfoLngAsrSetting record);

    int insertSelective(CHBasicInfoLngAsrSetting record);

    List<CHBasicInfoLngAsrSetting> selectByExample(CHBasicInfoLngAsrSettingExample example);

    CHBasicInfoLngAsrSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CHBasicInfoLngAsrSetting record, @Param("example") CHBasicInfoLngAsrSettingExample example);

    int updateByExample(@Param("record") CHBasicInfoLngAsrSetting record, @Param("example") CHBasicInfoLngAsrSettingExample example);

    int updateByPrimaryKeySelective(CHBasicInfoLngAsrSetting record);

    int updateByPrimaryKey(CHBasicInfoLngAsrSetting record);
}