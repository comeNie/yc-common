package com.ai.yc.common.cache;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.cache.base.AbstractCache;
import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.yc.common.api.cachekey.key.CacheKey;
import com.ai.yc.common.constants.CacheNSMapper;
import com.ai.yc.common.constants.Constants;
import com.ai.yc.common.dao.mapper.bo.SysPurpose;
import com.ai.yc.common.service.atom.syspurpose.ISysPurposeAtomSV;
import com.ai.yc.common.util.CacheFactoryUtil;
import com.ai.yc.common.util.PaaSConfUtil;
import com.alibaba.fastjson.JSON;

/**
 * @Description: 写用途到缓存
 * @author hougang@asiainfo.com
 * @date 2016年11月21日 下午3:45:22 
 * @version V1.0
 */
@Component
public class SysPurposeCache extends AbstractCache{
	
	@Autowired
	private ISysPurposeAtomSV iSysPurposeAtomSV;

	@Override
	public void write() throws Exception {
		List<SysPurpose> purposes =	iSysPurposeAtomSV.querySysPurposeList(Constants.ZH_CN);
		List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (areas != null && areas.length > 0) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_SYS_PURPOSE_RULE);
				cacheClientList.add(cacheClient);
			}
		}
		for (ICacheClient cacheClient : cacheClientList) {
			cacheClient.hset(CacheKey.PURPOSE_L_KEY, CacheKey.PURPOSE_L_KEY,JSON.toJSONString(purposes));
		}
		for(SysPurpose purpose:purposes){
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.PURPOSE_D_KEY, purpose.getPurposeId(),JSON.toJSONString(purpose));
			}
		}
	}

}
