/**
 * 
 */
package com.ai.yc.common.service.business.country;

import java.util.List;

import com.ai.yc.common.api.country.param.CountryRequest;
import com.ai.yc.common.dao.mapper.bo.GnCountry;

/**
 * 国家查询业务层<br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author xuyw
 */
public interface IGnCountryBusiSV {
	public List<GnCountry> queryCountry(CountryRequest request);
}
