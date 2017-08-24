package com.iguan.dao;

import com.iguan.entity.model.TEBasicInfo;
import com.iguan.entity.model.TEBasicInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEBasicInfoMapper {
    long countByExample(TEBasicInfoExample example);

    int deleteByExample(TEBasicInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TEBasicInfo record);

    int insertSelective(TEBasicInfo record);

    List<TEBasicInfo> selectByExample(TEBasicInfoExample example);

    TEBasicInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TEBasicInfo record, @Param("example") TEBasicInfoExample example);

    int updateByExample(@Param("record") TEBasicInfo record, @Param("example") TEBasicInfoExample example);

    int updateByPrimaryKeySelective(TEBasicInfo record);

    int updateByPrimaryKey(TEBasicInfo record);
}