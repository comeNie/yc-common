package com.ai.platform.common.test.cache;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.yc.common.api.region.key.RegionCacheKey;
import com.ai.yc.common.api.region.model.RegionInfo;
import com.ai.yc.common.constants.CacheNSMapper;
import com.ai.yc.common.util.CacheFactoryUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by liutong on 16/12/12.
 */
public class GnregionCacheTest {

    /**
     * 根据行政区编码获取详细信息
     */
    @Test
    public void selectByCode(){
        RegionInfo regionInfo = null;
        ICacheClient cacheClient= CacheFactoryUtil.getCacheClient(CacheNSMapper.CACHE_GN_REGION);
        String infoStr = cacheClient.hget(RegionCacheKey.GN_REGION_INFO_KEY,"3386");
        if (StringUtils.isNotBlank(infoStr)){
            regionInfo = JSON.parseObject(infoStr,RegionInfo.class);
        }
        System.out.println(regionInfo==null?"":(regionInfo.getRegionNameCn()+","+regionInfo.getRegionLevel()));
    }

    /**
     * 查询所有国家
     */
    @Test
    public void selectCountry(){
        List<RegionInfo> regionInfos = new ArrayList<>();
        ICacheClient cacheClient= CacheFactoryUtil.getCacheClient(CacheNSMapper.CACHE_GN_REGION);
        Set<String> countryCodes = cacheClient.smembers(RegionCacheKey.GN_REGION_COUNTRY_KEY);
        if (!CollectionUtil.isEmpty(countryCodes)){
            List<String> infoList = cacheClient.hmget(RegionCacheKey.GN_REGION_INFO_KEY,
                    countryCodes.toArray(new String[countryCodes.size()]));
            for (String info:infoList){
                regionInfos.add(JSON.parseObject(info,RegionInfo.class));
            }
        }
        System.out.println(regionInfos.size());
    }

    /**
     * 查询指定区域下的子区域
     */
    @Test
    public void selectChileByParentCode(){
        List<RegionInfo> regionInfos = new ArrayList<>();
        ICacheClient cacheClient= CacheFactoryUtil.getCacheClient(CacheNSMapper.CACHE_GN_REGION);
        String childStr = cacheClient.hget(RegionCacheKey.GN_REGION_PARENT_KEY,"3385");
        if (StringUtils.isNotBlank(childStr)){
            List<String> codeArray = JSON.parseArray(childStr,String.class);
            if (!CollectionUtil.isEmpty(codeArray)){
                List<String> infoList = cacheClient.hmget(RegionCacheKey.GN_REGION_INFO_KEY,
                        codeArray.toArray(new String[codeArray.size()]));
                for (String info:infoList){
                    regionInfos.add(JSON.parseObject(info,RegionInfo.class));
                }
            }
        }
        System.out.println(regionInfos.size());
    }
}
