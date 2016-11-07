package com.ai.platform.common.service.atom.country.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.platform.common.dao.mapper.bo.GnCountry;
import com.ai.platform.common.dao.mapper.bo.GnCountryCriteria;
import com.ai.platform.common.dao.mapper.factory.MapperFactory;
import com.ai.platform.common.service.atom.country.IGnCountryAtomSV;

/**
 * 实现层<br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author xuyw
 */
@Component
public class GnCountryAtomSVImpl implements IGnCountryAtomSV {

	@Override
	public List<GnCountry> queryCountry(GnCountryCriteria criteria) {

		return MapperFactory.getGnCountryMapper().selectByExample(criteria);
	}

}
