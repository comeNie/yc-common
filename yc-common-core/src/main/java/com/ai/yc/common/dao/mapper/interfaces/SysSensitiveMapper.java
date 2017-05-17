package com.ai.yc.common.dao.mapper.interfaces;

import com.ai.yc.common.dao.mapper.bo.SysSensitive;
import com.ai.yc.common.dao.mapper.bo.SysSensitiveCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSensitiveMapper {
    int countByExample(SysSensitiveCriteria example);

    int deleteByExample(SysSensitiveCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysSensitive record);

    int insertSelective(SysSensitive record);

    List<SysSensitive> selectByExample(SysSensitiveCriteria example);

    SysSensitive selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysSensitive record, @Param("example") SysSensitiveCriteria example);

    int updateByExample(@Param("record") SysSensitive record, @Param("example") SysSensitiveCriteria example);

    int updateByPrimaryKeySelective(SysSensitive record);

    int updateByPrimaryKey(SysSensitive record);
}