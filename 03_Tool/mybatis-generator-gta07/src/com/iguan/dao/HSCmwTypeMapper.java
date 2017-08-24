package com.iguan.dao;

import com.iguan.entity.model.HSCmwType;
import com.iguan.entity.model.HSCmwTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HSCmwTypeMapper {
    long countByExample(HSCmwTypeExample example);

    int deleteByExample(HSCmwTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HSCmwType record);

    int insertSelective(HSCmwType record);

    List<HSCmwType> selectByExample(HSCmwTypeExample example);

    HSCmwType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HSCmwType record, @Param("example") HSCmwTypeExample example);

    int updateByExample(@Param("record") HSCmwType record, @Param("example") HSCmwTypeExample example);

    int updateByPrimaryKeySelective(HSCmwType record);

    int updateByPrimaryKey(HSCmwType record);
}