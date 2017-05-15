package com.ai.yc.common.service.business.sysbasic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.yc.common.dao.mapper.bo.SysBasic;
import com.ai.yc.common.service.atom.sysbasic.ISysBasicAtomSV;
import com.ai.yc.common.service.business.sysbasic.IQuerySysBasicBusiSV;

/**
* @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
@Service
public class QuerySysBasicBusiSVImpl implements IQuerySysBasicBusiSV {
	
	@Autowired 
	private transient ISysBasicAtomSV  iSysBasicAtomSV;

	@Override
	public List<SysBasic> querySysBasic() {
		return iSysBasicAtomSV.querySysBasic();
	}

}
