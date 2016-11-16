/**
 * 
 */
package com.ai.yc.common.service.business.country.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.paas.ipaas.util.StringUtil;
import com.ai.yc.common.api.country.param.CountryRequest;
import com.ai.yc.common.dao.mapper.bo.GnCountry;
import com.ai.yc.common.dao.mapper.bo.GnCountryCriteria;
import com.ai.yc.common.service.atom.country.IGnCountryAtomSV;
import com.ai.yc.common.service.business.country.IGnCountryBusiSV;

/**
 * <br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author xuyw
 */
@Component
@Transactional
public class GnCountryBusiSVImpl implements IGnCountryBusiSV {
	@Autowired
	IGnCountryAtomSV gnCountryAtomSV;

	@Override
	public List<GnCountry> queryCountry(CountryRequest req) {
		GnCountryCriteria criteria = new GnCountryCriteria();
		GnCountryCriteria.Criteria c = criteria.createCriteria();
		if (req.getId() != null) {
			c.andIdEqualTo(req.getId());
		}
		if (!StringUtil.isBlank(req.getCountryNameCn())) {
			c.andCountryNameCnEqualTo(req.getCountryNameCn());
		}

		if (!StringUtil.isBlank(req.getCountryNameEn())) {
			c.andCountryNameEnEqualTo(req.getCountryNameEn());
		}
		if (!StringUtil.isBlank(req.getCountryValue())) {
			c.andCountryValueEqualTo(req.getCountryValue());
		}
		if (!StringUtil.isBlank(req.getCountryCode())) {
			c.andCountryCodeEqualTo(req.getCountryCode());
		}
		criteria.setOrderByClause("ORDER_ID DESC,OPERATION_TIME DESC");
		return gnCountryAtomSV.queryCountry(criteria);
	}

}
