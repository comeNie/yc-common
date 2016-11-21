package com.ai.yc.common.cache;

import java.util.ArrayList;
import java.util.List;

import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.yc.common.constants.CacheNSMapper;
import com.ai.yc.common.dao.mapper.bo.GnServiceNum;
import com.ai.yc.common.util.CacheFactoryUtil;
import com.ai.yc.common.util.PaaSConfUtil;
import com.alibaba.fastjson.JSON;

public class GnServiceNumCacheTread extends Thread{
    private List<GnServiceNum> resultList;
    List<ICacheClient> cacheClientList=new ArrayList<ICacheClient>();
    public GnServiceNumCacheTread(List<GnServiceNum> resultList){
        this.resultList=resultList;
        String[] areas=PaaSConfUtil.getAllSrvArea();
        if(areas!=null&&areas.length>0){
        	for(String srvarea:areas){
        		ICacheClient cacheClient=CacheFactoryUtil.getCacheClient(srvarea+"."+CacheNSMapper.CACHE_GN_SERVICE_NUM);
        		cacheClientList.add(cacheClient);
        	}
        }
    }
    @Override
    public void run() {
    	System.out.println("开始刷新缓存"+"【"+Thread.currentThread().getName()+"】");
        for (GnServiceNum svnum : resultList) {          
            String key=svnum.getServiceNumCode().toUpperCase();
            for(ICacheClient cacheClient:cacheClientList){
            	  cacheClient.hset(CacheNSMapper.CACHE_GN_SERVICE_NUM, key, JSON.toJSONString(svnum));
            }
        } 
        System.out.println("刷新缓存OK"+"【"+Thread.currentThread().getName()+"】");
    } 
}
