package com.iguan.dao;

import com.iguan.entity.model.CHBasicInfoType;
import com.iguan.entity.model.CHBasicInfoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CHBasicInfoTypeMapper {
    long countByExample(CHBasicInfoTypeExample example);

    int deleteByExample(CHBasicInfoTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CHBasicInfoType record);

    int insertSelective(CHBasicInfoType record);

    List<CHBasicInfoType> selectByExample(CHBasicInfoTypeExample example);

    CHBasicInfoType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CHBasicInfoType record, @Param("example") CHBasicInfoTypeExample example);

    int updateByExample(@Param("record") CHBasicInfoType record, @Param("example") CHBasicInfoTypeExample example);

    int updateByPrimaryKeySelective(CHBasicInfoType record);

    int updateByPrimaryKey(CHBasicInfoType record);
}