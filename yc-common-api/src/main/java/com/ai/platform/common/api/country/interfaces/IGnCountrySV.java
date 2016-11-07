package com.ai.platform.common.api.country.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.platform.common.api.country.param.CountryRequest;
import com.ai.platform.common.api.country.param.CountryResponse;

/**
 * 公共域-国家查询<br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author xuyw
 */
@Path("/country")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IGnCountrySV {
	/**
	 * 查询国家
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author xuyw
	 * @ApiCode	COUNTRY_10000
	 * @ApiDocMethod
	 * @RestRelativeURL country/queryCountry
	 */
	@POST
	@Path("/queryCountry")
	CountryResponse queryCountry(CountryRequest request)throws BusinessException,SystemException;
}
