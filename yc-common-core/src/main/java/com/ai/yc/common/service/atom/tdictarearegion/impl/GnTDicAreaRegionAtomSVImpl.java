package com.ai.yc.common.service.atom.tdictarearegion.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.yc.common.dao.mapper.bo.GnArea;
import com.ai.yc.common.dao.mapper.bo.GnAreaCriteria;
import com.ai.yc.common.dao.mapper.bo.GnTDicAreaRegion;
import com.ai.yc.common.dao.mapper.bo.GnTDicAreaRegionCriteria;
import com.ai.yc.common.dao.mapper.bo.SysOffice;
import com.ai.yc.common.dao.mapper.bo.SysOfficeCriteria;
import com.ai.yc.common.dao.mapper.factory.MapperFactory;
import com.ai.yc.common.service.atom.tdictarearegion.IGnTDicAreaRegionAtomSV;

@Component
public class GnTDicAreaRegionAtomSVImpl implements IGnTDicAreaRegionAtomSV {

	@Override
	public List<GnTDicAreaRegion> selectAllDicAreaRegion() {
		GnTDicAreaRegionCriteria example=new GnTDicAreaRegionCriteria();
		example.or().andRegionCodeIsNotNull();
		return MapperFactory.getGnTDicAreaRegionMapper().selectByExample(example);
	}

	
	@Override
	public List<GnArea> getAllGnArea() {
		GnAreaCriteria example=new GnAreaCriteria();
		example.or().andAreaCodeIsNotNull();
		return MapperFactory.getGnAreaMapper().selectByExample(example);
	}
	
	@Override
	public GnTDicAreaRegion selectByAreaCode(String areacode) {
		return MapperFactory.getGnTDicAreaRegionMapper().selectByPrimaryKey(areacode);
	}

	@Override
	public List<SysOffice> getAllOffice() {
		SysOfficeCriteria example=new SysOfficeCriteria();
		example.or().andDelFlagEqualTo("0").andUseableEqualTo("0");
		return MapperFactory.getSysOfficeMapper().selectByExample(example);
	}
}
