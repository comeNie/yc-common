package com.ai.yc.common.service.business.cacheserice;

import java.util.ArrayList;
import java.util.List;

import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.yc.common.api.cachekey.key.CacheKey;
import com.ai.yc.common.constants.CacheNSMapper;
import com.ai.yc.common.dao.mapper.bo.SysDuad;
import com.ai.yc.common.util.CacheFactoryUtil;
import com.ai.yc.common.util.PaaSConfUtil;
import com.alibaba.fastjson.JSON;

public class SysduadCacheThread extends Thread {
	
	

	private List<SysDuad> duads;

	private String orderType;

	List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();

	public SysduadCacheThread(List<SysDuad> duads, String orderType) {
		super();
		this.duads = duads;
		this.orderType = orderType;
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (areas != null && areas.length > 0) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_SYS_DUAD_RULE);
				cacheClientList.add(cacheClient);
			}
		}
	}

	@Override
	public void run() {
		super.run();
		for (ICacheClient cacheClient : cacheClientList) {
			cacheClient.hset(CacheKey.DUAD_L_KEY, orderType,JSON.toJSONString(duads));
		}
		for (SysDuad duad : duads) {
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.DUAD_D_KEY, duad.getDuadId(),JSON.toJSONString(duad));
			}
		}

	}

}
