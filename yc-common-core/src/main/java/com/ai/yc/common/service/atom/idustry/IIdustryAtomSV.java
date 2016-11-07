package com.ai.yc.common.service.atom.idustry;

import java.util.List;

import com.ai.yc.common.dao.mapper.bo.GnIndustry;
import com.ai.yc.common.dao.mapper.bo.GnIndustryCriteria;

public interface IIdustryAtomSV {

    List<GnIndustry> selectByExample(GnIndustryCriteria example);

    GnIndustry selectByPrimaryKey(String industryCode);
}
