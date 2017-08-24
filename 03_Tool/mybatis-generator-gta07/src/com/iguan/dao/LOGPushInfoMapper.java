package com.iguan.dao;

import com.iguan.entity.model.LOGPushInfo;
import com.iguan.entity.model.LOGPushInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LOGPushInfoMapper {
    long countByExample(LOGPushInfoExample example);

    int deleteByExample(LOGPushInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LOGPushInfo record);

    int insertSelective(LOGPushInfo record);

    List<LOGPushInfo> selectByExampleWithBLOBs(LOGPushInfoExample example);

    List<LOGPushInfo> selectByExample(LOGPushInfoExample example);

    LOGPushInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LOGPushInfo record, @Param("example") LOGPushInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") LOGPushInfo record, @Param("example") LOGPushInfoExample example);

    int updateByExample(@Param("record") LOGPushInfo record, @Param("example") LOGPushInfoExample example);

    int updateByPrimaryKeySelective(LOGPushInfo record);

    int updateByPrimaryKeyWithBLOBs(LOGPushInfo record);

    int updateByPrimaryKey(LOGPushInfo record);
}