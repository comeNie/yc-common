/**
 * 
 */
package com.ai.yc.common.cache;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.cache.base.AbstractCache;
import com.ai.opt.sdk.components.mcs.MCSClientFactory;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.paas.ipaas.util.SerializeUtil;
import com.ai.yc.common.constants.CacheNSMapper;
import com.ai.yc.common.dao.mapper.bo.GnArea;
import com.ai.yc.common.dao.mapper.bo.GnTDicAreaRegion;
import com.ai.yc.common.dao.mapper.bo.SysOffice;
import com.ai.yc.common.service.atom.tdictarearegion.IGnTDicAreaRegionAtomSV;

/**
 * @Description: 写GnTDicAreaRegion到缓存<br>
 * Date: 2016年11月28日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author gucl
 */
@Component
public class GnTDicAreaRegionCache  extends AbstractCache {
	 private static final Logger logger = LoggerFactory.getLogger(GnTDicAreaRegionCache.class);
	 @Autowired
	 private IGnTDicAreaRegionAtomSV sv;

	@Override
	public void write() throws Exception {
		List<GnTDicAreaRegion> list=sv.selectAllDicAreaRegion();
		if (CollectionUtil.isEmpty(list)) {
            return;
        }
		
		List<GnArea> listGnArea=sv.getAllGnArea();
		if (CollectionUtil.isEmpty(listGnArea)) {
            return;
        }
		List<SysOffice> listAllOffice=sv.getAllOffice();
		if (CollectionUtil.isEmpty(listAllOffice)) {
            return;
        }
		
		logger.info("写入GnTDicAreaRegion缓存开始");
		ICacheClient client= MCSClientFactory.getCacheClient(CacheNSMapper.CACHE_GN_T_DICT_AREA_REGION);
		ICacheClient clientGnArea= MCSClientFactory.getCacheClient("com.ai.platform.common.cache.gnarea");
		
		for(GnTDicAreaRegion areaRegion:list){
			String  areaCode = areaRegion.getAreaCode();
			String  regionCode = areaRegion.getRegionCode();
			client.hset(CacheNSMapper.CACHE_GN_T_DICT_AREA_REGION,areaCode,regionCode);	
		}
		
		clientGnArea.set("areaTreeALL".getBytes(),SerializeUtil.serialize(listGnArea));
		clientGnArea.set(("OfficeAllList").getBytes(), SerializeUtil.serialize(listAllOffice));
		logger.info("写入OfficeAllList缓存结束,写入："+listAllOffice.size()+"");
		logger.info("写入areaTreeALL缓存结束,写入："+listGnArea.size()+"");
		logger.info("写入GnTDicAreaRegion缓存结束");
	}

}
