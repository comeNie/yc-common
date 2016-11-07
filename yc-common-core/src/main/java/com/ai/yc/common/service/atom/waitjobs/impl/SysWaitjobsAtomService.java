package com.ai.yc.common.service.atom.waitjobs.impl;

import java.sql.Timestamp;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.yc.common.constants.VOConstants.WaitjobsStatusConstant;
import com.ai.yc.common.dao.mapper.bo.SysWaitjobs;
import com.ai.yc.common.dao.mapper.bo.SysWaitjobsCriteria;
import com.ai.yc.common.dao.mapper.bo.SysWaitjobsCriteria.Criteria;
import com.ai.yc.common.dao.mapper.factory.MapperFactory;
import com.ai.yc.common.service.atom.waitjobs.ISysWaitjobsAtomService;

@Component
public class SysWaitjobsAtomService implements ISysWaitjobsAtomService{

	@Override
	public String insertWaitjobs(SysWaitjobs waitjobs) {
		String status = waitjobs.getStatus();
		if(StringUtils.isEmpty(status)){
			waitjobs.setStatus(WaitjobsStatusConstant.WAIT);
		}
		Timestamp arriveData = waitjobs.getArriveData();
		if(arriveData == null){
			Timestamp sysDate = DateUtil.getSysDate();
			waitjobs.setArriveData(sysDate);
		}
		String newId = SeqUtil.getNewId("SYS$SYSWAITJOBS$ID").toString();
		waitjobs.setId(newId);
		int insertCount = MapperFactory.getSysWaitjobsMapper().insertSelective(waitjobs);
		if(insertCount>0){
			return newId;
		}else{
			return null;
		}
	}

	@Override
	public int completeWaitjobs(String id, String tenantId) {
		SysWaitjobsCriteria example = new SysWaitjobsCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id.trim());
		criteria.andTenantIdEqualTo(tenantId.trim());
		SysWaitjobs record = new SysWaitjobs();
		record.setStatus(WaitjobsStatusConstant.END);
		return MapperFactory.getSysWaitjobsMapper().updateByExampleSelective(record , example);
	}

}
