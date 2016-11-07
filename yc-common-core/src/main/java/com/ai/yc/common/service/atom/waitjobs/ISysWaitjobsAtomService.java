package com.ai.yc.common.service.atom.waitjobs;

import com.ai.yc.common.dao.mapper.bo.SysWaitjobs;

public interface ISysWaitjobsAtomService {
	
	public String insertWaitjobs(SysWaitjobs waitjobs);
	
	public int completeWaitjobs(String id, String tenantId);
}
