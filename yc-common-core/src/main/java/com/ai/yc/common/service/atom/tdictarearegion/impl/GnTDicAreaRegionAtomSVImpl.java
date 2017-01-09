package com.ai.yc.common.service.atom.tdictarearegion.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.yc.common.dao.mapper.bo.GnTDicAreaRegion;
import com.ai.yc.common.dao.mapper.bo.GnTDicAreaRegionCriteria;
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
	public GnTDicAreaRegion selectByAreaCode(String areacode) {
		return MapperFactory.getGnTDicAreaRegionMapper().selectByPrimaryKey(areacode);
	}

}
