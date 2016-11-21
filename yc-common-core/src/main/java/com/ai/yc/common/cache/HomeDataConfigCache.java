package com.ai.yc.common.cache;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.cache.base.AbstractCache;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.yc.common.api.cachekey.key.CacheKey;
import com.ai.yc.common.api.cachekey.model.HomeDataConfig;
import com.ai.yc.common.constants.CacheNSMapper;
import com.ai.yc.common.dao.mapper.bo.SysConfig;
import com.ai.yc.common.service.atom.sysconfig.ISysConfigAtomSV;
import com.ai.yc.common.util.CacheFactoryUtil;
import com.ai.yc.common.util.PaaSConfUtil;
import com.alibaba.fastjson.JSON;

/**
 * @Description: 写首页配置数据到缓存
 * @author hougang@asiainfo.com
 * @date 2016年11月21日 下午4:00:45 
 * @version V1.0
 */
@Component
public class HomeDataConfigCache extends AbstractCache{
	
	@Autowired
	private ISysConfigAtomSV iSysConfigAtomSV;

	@Override
	public void write() throws Exception {
		SysConfig config =  iSysConfigAtomSV.selectOne();
		if(config!=null){
			HomeDataConfig hConfig = new HomeDataConfig();
			BeanUtils.copyProperties(hConfig, config);
			List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
			String[] areas = PaaSConfUtil.getAllSrvArea();
			if (areas != null && areas.length > 0) {
				for (String srvarea : areas) {
					ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_HOME_DATA_CONFIG_RULE);
					cacheClientList.add(cacheClient);
				}
			}
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.HOME_DATA_CONFIG_KEY, CacheKey.HOME_DATA_CONFIG_KEY,JSON.toJSONString(hConfig));
			}
		}
	}

}
