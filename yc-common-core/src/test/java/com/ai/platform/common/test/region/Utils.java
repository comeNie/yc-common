package com.ai.platform.common.test.region;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.yc.common.dao.mapper.bo.GnRegion;
import com.ai.yc.common.dao.mapper.bo.GnRegionCriteria;
import com.ai.yc.common.dao.mapper.factory.MapperFactory;
import com.ai.yc.common.dao.mapper.interfaces.GnRegionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by liutong on 16/12/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/core-context.xml")
public class Utils {
    private static final Logger LOGGER = LoggerFactory.getLogger(Utils.class);

    /**
     * 用于第一次初始化父区域code
     */
    @Test
    public void genParent(){
        GnRegionMapper regionMapper = MapperFactory.getGnRegionMapper();
        //获取所有的列表
        GnRegionCriteria example = new GnRegionCriteria();
        GnRegionCriteria.Criteria criteria = example.createCriteria();
        criteria.andRegionLevelNotEqualTo(0);
        List<GnRegion> regionList = regionMapper.selectByExample(example);
        List<GnRegion> parentList;
        for(GnRegion gnRegion:regionList){
            String parentEn = gnRegion.getParentRegionEn();
            String[] parents = parentEn.split("_");
            int patNum = parents.length;
            if (patNum<2){
                LOGGER.error("region_id={},region_name_cn={},parent_region_en={}",
                        gnRegion.getRegionCode(),gnRegion.getRegionNameCn(),gnRegion.getParentRegionEn());
                System.out.println("region_id:"+gnRegion.getRegionCode()+",");
                continue;
            }
            example.clear();
            criteria = example.createCriteria();
            criteria.andRegionNameEnEqualTo(parents[patNum-2]);
            parentList = regionMapper.selectByExample(example);
            //查询到父类
            if (!CollectionUtil.isEmpty(parentList)){
                GnRegion p = parentList.get(0);
                gnRegion.setParentRegionCode(p.getRegionCode());
                regionMapper.updateByPrimaryKey(gnRegion);
            }
        }
    }
}
