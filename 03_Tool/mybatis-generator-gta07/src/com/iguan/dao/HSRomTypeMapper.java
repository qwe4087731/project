package com.iguan.dao;

import com.iguan.entity.model.HSRomType;
import com.iguan.entity.model.HSRomTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HSRomTypeMapper {
    long countByExample(HSRomTypeExample example);

    int deleteByExample(HSRomTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HSRomType record);

    int insertSelective(HSRomType record);

    List<HSRomType> selectByExample(HSRomTypeExample example);

    HSRomType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HSRomType record, @Param("example") HSRomTypeExample example);

    int updateByExample(@Param("record") HSRomType record, @Param("example") HSRomTypeExample example);

    int updateByPrimaryKeySelective(HSRomType record);

    int updateByPrimaryKey(HSRomType record);
}