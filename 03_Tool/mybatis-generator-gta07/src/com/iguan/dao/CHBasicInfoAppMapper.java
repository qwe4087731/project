package com.iguan.dao;

import com.iguan.entity.model.CHBasicInfoApp;
import com.iguan.entity.model.CHBasicInfoAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CHBasicInfoAppMapper {
    long countByExample(CHBasicInfoAppExample example);

    int deleteByExample(CHBasicInfoAppExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CHBasicInfoApp record);

    int insertSelective(CHBasicInfoApp record);

    List<CHBasicInfoApp> selectByExampleWithBLOBs(CHBasicInfoAppExample example);

    List<CHBasicInfoApp> selectByExample(CHBasicInfoAppExample example);

    CHBasicInfoApp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CHBasicInfoApp record, @Param("example") CHBasicInfoAppExample example);

    int updateByExampleWithBLOBs(@Param("record") CHBasicInfoApp record, @Param("example") CHBasicInfoAppExample example);

    int updateByExample(@Param("record") CHBasicInfoApp record, @Param("example") CHBasicInfoAppExample example);

    int updateByPrimaryKeySelective(CHBasicInfoApp record);

    int updateByPrimaryKeyWithBLOBs(CHBasicInfoApp record);

    int updateByPrimaryKey(CHBasicInfoApp record);
}