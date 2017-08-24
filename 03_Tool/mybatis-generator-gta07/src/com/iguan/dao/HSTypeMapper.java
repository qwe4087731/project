package com.iguan.dao;

import com.iguan.entity.model.HSType;
import com.iguan.entity.model.HSTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HSTypeMapper {
    long countByExample(HSTypeExample example);

    int deleteByExample(HSTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HSType record);

    int insertSelective(HSType record);

    List<HSType> selectByExample(HSTypeExample example);

    HSType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HSType record, @Param("example") HSTypeExample example);

    int updateByExample(@Param("record") HSType record, @Param("example") HSTypeExample example);

    int updateByPrimaryKeySelective(HSType record);

    int updateByPrimaryKey(HSType record);
}