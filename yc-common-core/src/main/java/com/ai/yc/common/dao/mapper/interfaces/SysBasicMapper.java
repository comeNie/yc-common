package com.ai.yc.common.dao.mapper.interfaces;

import com.ai.yc.common.dao.mapper.bo.SysBasic;
import com.ai.yc.common.dao.mapper.bo.SysBasicCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBasicMapper {
    int countByExample(SysBasicCriteria example);

    int deleteByExample(SysBasicCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysBasic record);

    int insertSelective(SysBasic record);

    List<SysBasic> selectByExample(SysBasicCriteria example);

    SysBasic selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysBasic record, @Param("example") SysBasicCriteria example);

    int updateByExample(@Param("record") SysBasic record, @Param("example") SysBasicCriteria example);

    int updateByPrimaryKeySelective(SysBasic record);

    int updateByPrimaryKey(SysBasic record);
}