package com.ai.yc.common.cache;

import java.util.ArrayList;
import java.util.List;

import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.yc.common.constants.CacheNSMapper;
import com.ai.yc.common.dao.mapper.bo.GnArea;
import com.ai.yc.common.util.CacheFactoryUtil;
import com.ai.yc.common.util.PaaSConfUtil;
import com.alibaba.fastjson.JSON;

public class GnAreaCacheTread extends Thread{
    private List<GnArea> resultList;
    List<ICacheClient> cacheClientList=new ArrayList<ICacheClient>();
    public GnAreaCacheTread(List<GnArea> resultList){
        this.resultList=resultList;
        String[] areas=PaaSConfUtil.getAllSrvArea();
        if(areas!=null&&areas.length>0){
        	for(String srvarea:areas){
        		ICacheClient cacheClient=CacheFactoryUtil.getCacheClient(srvarea+"."+CacheNSMapper.CACHE_GN_AREA);
        		cacheClientList.add(cacheClient);
        	}
        }
    }
    @Override
    public void run() {
        for (GnArea area : resultList) {          
            String key=area.getAreaCode().toUpperCase();
            for(ICacheClient cacheClient:cacheClientList){
            	cacheClient.hset(CacheNSMapper.CACHE_GN_AREA, key, JSON.toJSONString(area));
            }
        } 
        //System.out.println("【"+Thread.currentThread().getName()+"】");
    } 
}
