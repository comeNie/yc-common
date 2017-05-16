package com.ai.yc.common.dao.mapper.interfaces;

import com.ai.yc.common.dao.mapper.bo.SysConfig;
import com.ai.yc.common.dao.mapper.bo.SysConfigCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysConfigMapper {
    int countByExample(SysConfigCriteria example);

    int deleteByExample(SysConfigCriteria example);

    int deleteByPrimaryKey(String configId);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    List<SysConfig> selectByExample(SysConfigCriteria example);

    SysConfig selectByPrimaryKey(String configId);

    int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigCriteria example);

    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigCriteria example);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}