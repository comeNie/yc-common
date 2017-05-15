package com.ai.yc.common.dao.mapper.interfaces;

import com.ai.yc.common.dao.mapper.bo.SysJf;
import com.ai.yc.common.dao.mapper.bo.SysJfCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysJfMapper {
    int countByExample(SysJfCriteria example);

    int deleteByExample(SysJfCriteria example);

    int deleteByPrimaryKey(String did);

    int insert(SysJf record);

    int insertSelective(SysJf record);

    List<SysJf> selectByExample(SysJfCriteria example);

    SysJf selectByPrimaryKey(String did);

    int updateByExampleSelective(@Param("record") SysJf record, @Param("example") SysJfCriteria example);

    int updateByExample(@Param("record") SysJf record, @Param("example") SysJfCriteria example);

    int updateByPrimaryKeySelective(SysJf record);

    int updateByPrimaryKey(SysJf record);
}