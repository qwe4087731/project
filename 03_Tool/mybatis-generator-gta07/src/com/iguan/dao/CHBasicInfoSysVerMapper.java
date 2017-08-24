package com.iguan.dao;

import com.iguan.entity.model.CHBasicInfoSysVer;
import com.iguan.entity.model.CHBasicInfoSysVerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CHBasicInfoSysVerMapper {
    long countByExample(CHBasicInfoSysVerExample example);

    int deleteByExample(CHBasicInfoSysVerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CHBasicInfoSysVer record);

    int insertSelective(CHBasicInfoSysVer record);

    List<CHBasicInfoSysVer> selectByExample(CHBasicInfoSysVerExample example);

    CHBasicInfoSysVer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CHBasicInfoSysVer record, @Param("example") CHBasicInfoSysVerExample example);

    int updateByExample(@Param("record") CHBasicInfoSysVer record, @Param("example") CHBasicInfoSysVerExample example);

    int updateByPrimaryKeySelective(CHBasicInfoSysVer record);

    int updateByPrimaryKey(CHBasicInfoSysVer record);
}