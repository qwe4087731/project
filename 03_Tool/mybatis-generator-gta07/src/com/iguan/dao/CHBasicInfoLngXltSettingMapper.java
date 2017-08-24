package com.iguan.dao;

import com.iguan.entity.model.CHBasicInfoLngXltSetting;
import com.iguan.entity.model.CHBasicInfoLngXltSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CHBasicInfoLngXltSettingMapper {
    long countByExample(CHBasicInfoLngXltSettingExample example);

    int deleteByExample(CHBasicInfoLngXltSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CHBasicInfoLngXltSetting record);

    int insertSelective(CHBasicInfoLngXltSetting record);

    List<CHBasicInfoLngXltSetting> selectByExample(CHBasicInfoLngXltSettingExample example);

    CHBasicInfoLngXltSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CHBasicInfoLngXltSetting record, @Param("example") CHBasicInfoLngXltSettingExample example);

    int updateByExample(@Param("record") CHBasicInfoLngXltSetting record, @Param("example") CHBasicInfoLngXltSettingExample example);

    int updateByPrimaryKeySelective(CHBasicInfoLngXltSetting record);

    int updateByPrimaryKey(CHBasicInfoLngXltSetting record);
}