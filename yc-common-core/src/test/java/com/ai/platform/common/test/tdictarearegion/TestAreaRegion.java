package com.ai.platform.common.test.tdictarearegion;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.sdk.components.mcs.MCSClientFactory;
import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.yc.common.constants.CacheNSMapper;
import com.ai.yc.common.dao.mapper.bo.GnTDicAreaRegion;
import com.ai.yc.common.service.atom.tdictarearegion.IGnTDicAreaRegionAtomSV;
import com.alibaba.fastjson.JSON;

/**
 * Created by gucl 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/core-context.xml")
public class TestAreaRegion {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestAreaRegion.class);

    @Autowired
    private IGnTDicAreaRegionAtomSV sv;
    /**
     */
    @Test
    public void testList(){
    	 List<GnTDicAreaRegion> list=sv.selectAllDicAreaRegion();
    	 System.out.println("count="+list.size());
        System.out.println("result="+JSON.toJSONString(list));
    }
    
    @Test
    public void testSingle(){
    	 String areacode="110000";
		GnTDicAreaRegion single=sv.selectByAreaCode(areacode);
        System.out.println("result="+JSON.toJSONString(single));
    }
    
    @Test
    public void testSingleCache(){
    	 String areaCode="110000";
    	 ICacheClient client= MCSClientFactory.getCacheClient(CacheNSMapper.CACHE_GN_T_DICT_AREA_REGION);
    	 String regionCode=client.hget(CacheNSMapper.CACHE_GN_T_DICT_AREA_REGION,areaCode);
        System.out.println("result="+regionCode);
    }
}
