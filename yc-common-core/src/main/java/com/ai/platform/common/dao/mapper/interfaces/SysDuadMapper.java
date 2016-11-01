package com.ai.platform.common.dao.mapper.interfaces;

import com.ai.platform.common.dao.mapper.bo.SysDuad;
import com.ai.platform.common.dao.mapper.bo.SysDuadCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDuadMapper {
    int countByExample(SysDuadCriteria example);

    int deleteByExample(SysDuadCriteria example);

    int deleteByPrimaryKey(String duadId);

    int insert(SysDuad record);

    int insertSelective(SysDuad record);

    List<SysDuad> selectByExample(SysDuadCriteria example);

    SysDuad selectByPrimaryKey(String duadId);

    int updateByExampleSelective(@Param("record") SysDuad record, @Param("example") SysDuadCriteria example);

    int updateByExample(@Param("record") SysDuad record, @Param("example") SysDuadCriteria example);

    int updateByPrimaryKeySelective(SysDuad record);

    int updateByPrimaryKey(SysDuad record);
}