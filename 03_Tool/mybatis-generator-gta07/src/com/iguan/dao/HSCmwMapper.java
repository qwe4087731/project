package com.iguan.dao;

import com.iguan.entity.model.HSCmw;
import com.iguan.entity.model.HSCmwExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HSCmwMapper {
    long countByExample(HSCmwExample example);

    int deleteByExample(HSCmwExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HSCmw record);

    int insertSelective(HSCmw record);

    List<HSCmw> selectByExample(HSCmwExample example);

    HSCmw selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HSCmw record, @Param("example") HSCmwExample example);

    int updateByExample(@Param("record") HSCmw record, @Param("example") HSCmwExample example);

    int updateByPrimaryKeySelective(HSCmw record);

    int updateByPrimaryKey(HSCmw record);
}