package com.iguan.dao;

import com.iguan.entity.model.CHBasicInfoLocInfo;
import com.iguan.entity.model.CHBasicInfoLocInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CHBasicInfoLocInfoMapper {
    long countByExample(CHBasicInfoLocInfoExample example);

    int deleteByExample(CHBasicInfoLocInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CHBasicInfoLocInfo record);

    int insertSelective(CHBasicInfoLocInfo record);

    List<CHBasicInfoLocInfo> selectByExample(CHBasicInfoLocInfoExample example);

    CHBasicInfoLocInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CHBasicInfoLocInfo record, @Param("example") CHBasicInfoLocInfoExample example);

    int updateByExample(@Param("record") CHBasicInfoLocInfo record, @Param("example") CHBasicInfoLocInfoExample example);

    int updateByPrimaryKeySelective(CHBasicInfoLocInfo record);

    int updateByPrimaryKey(CHBasicInfoLocInfo record);
}