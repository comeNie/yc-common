/**
 * 
 */
package com.ai.yc.common.cache;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.cache.base.AbstractCache;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.yc.common.api.cachekey.key.CacheKey;
import com.ai.yc.common.api.country.param.CountryRequest;
import com.ai.yc.common.constants.CacheNSMapper;
import com.ai.yc.common.dao.mapper.bo.GnCountry;
import com.ai.yc.common.service.business.country.IGnCountryBusiSV;
import com.ai.yc.common.util.CacheFactoryUtil;
import com.ai.yc.common.util.PaaSConfUtil;
import com.alibaba.fastjson.JSON;

/**
 * @Description: 写国家到缓存<br>
 * Date: 2016年11月28日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author xuyw
 */
@Component
public class GnCountryCache  extends AbstractCache {
	 private static final Logger logger = LoggerFactory.getLogger(GnCountryCache.class);
	@Autowired
	IGnCountryBusiSV gnCountryBusiSV;
	@Override
	public void write() throws Exception {
		List<GnCountry> list = gnCountryBusiSV.queryCountry(new CountryRequest());
		if (CollectionUtil.isEmpty(list)) {
            return;
        }
		logger.info("写入国家缓存开始");
		List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (!CollectionUtil.isEmpty(areas)) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_GN_COUNTRY);
				cacheClientList.add(cacheClient);
			}
		}
		String countryListStr = JSON.toJSONString(list);
		for (ICacheClient cacheClient : cacheClientList) {
			cacheClient.hset(CacheKey.COUNTRY_L_KEY,CacheKey.COUNTRY_L_KEY,countryListStr);
		}
		for(GnCountry country:list){
			String countryStr = JSON.toJSONString(country);
			String  id = String.valueOf(country.getId());
			String countryCode = country.getCountryCode();
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.COUNTRY_D_KEY,id,countryStr);
				cacheClient.hset(CacheKey.COUNTRY_D_KEY,countryCode,countryStr);
			}
		}
		logger.info("写入国家缓存结束");
	}

}
