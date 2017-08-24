package com.iguan.dao;

import com.iguan.entity.model.HSRom;
import com.iguan.entity.model.HSRomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HSRomMapper {
    long countByExample(HSRomExample example);

    int deleteByExample(HSRomExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HSRom record);

    int insertSelective(HSRom record);

    List<HSRom> selectByExample(HSRomExample example);

    HSRom selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HSRom record, @Param("example") HSRomExample example);

    int updateByExample(@Param("record") HSRom record, @Param("example") HSRomExample example);

    int updateByPrimaryKeySelective(HSRom record);

    int updateByPrimaryKey(HSRom record);
}