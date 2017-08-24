package com.iguan.dao;

import com.iguan.entity.model.CHBasicInfoLngTtsSetting;
import com.iguan.entity.model.CHBasicInfoLngTtsSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CHBasicInfoLngTtsSettingMapper {
    long countByExample(CHBasicInfoLngTtsSettingExample example);

    int deleteByExample(CHBasicInfoLngTtsSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CHBasicInfoLngTtsSetting record);

    int insertSelective(CHBasicInfoLngTtsSetting record);

    List<CHBasicInfoLngTtsSetting> selectByExample(CHBasicInfoLngTtsSettingExample example);

    CHBasicInfoLngTtsSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CHBasicInfoLngTtsSetting record, @Param("example") CHBasicInfoLngTtsSettingExample example);

    int updateByExample(@Param("record") CHBasicInfoLngTtsSetting record, @Param("example") CHBasicInfoLngTtsSettingExample example);

    int updateByPrimaryKeySelective(CHBasicInfoLngTtsSetting record);

    int updateByPrimaryKey(CHBasicInfoLngTtsSetting record);
}