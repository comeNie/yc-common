package com.ai.yc.common.dao.mapper.interfaces;

import com.ai.yc.common.dao.mapper.bo.SysRegist;
import com.ai.yc.common.dao.mapper.bo.SysRegistCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRegistMapper {
    int countByExample(SysRegistCriteria example);

    int deleteByExample(SysRegistCriteria example);

    int deleteByPrimaryKey(String aid);

    int insert(SysRegist record);

    int insertSelective(SysRegist record);

    List<SysRegist> selectByExample(SysRegistCriteria example);

    SysRegist selectByPrimaryKey(String aid);

    int updateByExampleSelective(@Param("record") SysRegist record, @Param("example") SysRegistCriteria example);

    int updateByExample(@Param("record") SysRegist record, @Param("example") SysRegistCriteria example);

    int updateByPrimaryKeySelective(SysRegist record);

    int updateByPrimaryKey(SysRegist record);
}