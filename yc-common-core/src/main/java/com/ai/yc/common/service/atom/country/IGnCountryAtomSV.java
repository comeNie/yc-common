/**
 * 
 */
package com.ai.yc.common.service.atom.country;

import java.util.List;

import com.ai.yc.common.dao.mapper.bo.GnCountry;
import com.ai.yc.common.dao.mapper.bo.GnCountryCriteria;

/**
 * 国家查询原子层<br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author xuyw
 */
public interface IGnCountryAtomSV {
	public List<GnCountry> queryCountry(GnCountryCriteria criteria);
}
