package com.iguan.dao;

import com.iguan.entity.model.CHBasicInfoXltInfo;
import com.iguan.entity.model.CHBasicInfoXltInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CHBasicInfoXltInfoMapper {
    long countByExample(CHBasicInfoXltInfoExample example);

    int deleteByExample(CHBasicInfoXltInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CHBasicInfoXltInfo record);

    int insertSelective(CHBasicInfoXltInfo record);

    List<CHBasicInfoXltInfo> selectByExample(CHBasicInfoXltInfoExample example);

    CHBasicInfoXltInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CHBasicInfoXltInfo record, @Param("example") CHBasicInfoXltInfoExample example);

    int updateByExample(@Param("record") CHBasicInfoXltInfo record, @Param("example") CHBasicInfoXltInfoExample example);

    int updateByPrimaryKeySelective(CHBasicInfoXltInfo record);

    int updateByPrimaryKey(CHBasicInfoXltInfo record);
}