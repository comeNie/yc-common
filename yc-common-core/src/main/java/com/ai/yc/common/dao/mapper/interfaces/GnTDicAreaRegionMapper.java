package com.ai.yc.common.dao.mapper.interfaces;

import com.ai.yc.common.dao.mapper.bo.GnTDicAreaRegion;
import com.ai.yc.common.dao.mapper.bo.GnTDicAreaRegionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GnTDicAreaRegionMapper {
    int countByExample(GnTDicAreaRegionCriteria example);

    int deleteByExample(GnTDicAreaRegionCriteria example);

    int deleteByPrimaryKey(String areaCode);

    int insert(GnTDicAreaRegion record);

    int insertSelective(GnTDicAreaRegion record);

    List<GnTDicAreaRegion> selectByExample(GnTDicAreaRegionCriteria example);

    GnTDicAreaRegion selectByPrimaryKey(String areaCode);

    int updateByExampleSelective(@Param("record") GnTDicAreaRegion record, @Param("example") GnTDicAreaRegionCriteria example);

    int updateByExample(@Param("record") GnTDicAreaRegion record, @Param("example") GnTDicAreaRegionCriteria example);

    int updateByPrimaryKeySelective(GnTDicAreaRegion record);

    int updateByPrimaryKey(GnTDicAreaRegion record);
}