package com.ai.yc.common.service.elasticjob;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.yc.common.api.sysconfig.interfaces.IElasticJobSV;
import com.alibaba.fastjson.JSON;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

/**
 * @Description: 自动取消订单定时任务
 * @author hougang@asiainfo.com
 * @date 2016年11月17日 下午4:45:06 
 * @version V1.0
 */
public class AutoIncreaseHonePageNum implements SimpleJob {
	
    private static final Logger LOG = LoggerFactory.getLogger(AutoIncreaseHonePageNum.class);
    
    @Override
	public void execute(ShardingContext shardingContext){
    	LOG.info("自动增长计数start.....................");
		IElasticJobSV elasticJobSV = DubboConsumerFactory.getService(IElasticJobSV.class);
    	BaseResponse resp = elasticJobSV.autoIncreaseHomeNum();
    	LOG.info("自动增长计数消息："+JSON.toJSONString(resp));
    	
    	LOG.info("自动增长计数end.....................");
	}

}
