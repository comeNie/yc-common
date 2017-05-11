package com.ai.yc.common.dao.mapper.interfaces;

import com.ai.yc.common.dao.mapper.bo.SysItembank;
import com.ai.yc.common.dao.mapper.bo.SysItembankCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysItembankMapper {
    int countByExample(SysItembankCriteria example);

    int deleteByExample(SysItembankCriteria example);

    int insert(SysItembank record);

    int insertSelective(SysItembank record);

    List<SysItembank> selectByExample(SysItembankCriteria example);

    int updateByExampleSelective(@Param("record") SysItembank record, @Param("example") SysItembankCriteria example);

    int updateByExample(@Param("record") SysItembank record, @Param("example") SysItembankCriteria example);
}