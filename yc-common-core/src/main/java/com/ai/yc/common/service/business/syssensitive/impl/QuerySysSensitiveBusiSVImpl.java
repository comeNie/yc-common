package com.ai.yc.common.service.business.syssensitive.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.syssensitive.param.SensitivePageQueryRequest;
import com.ai.yc.common.api.syssensitive.param.SensitivePageVo;
import com.ai.yc.common.service.atom.syssensitive.ISysSensitiveAtomSV;
import com.ai.yc.common.service.business.syssensitive.IQuerySysSensitiveBusiSV;

/**
 * @author shancc
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Service
public class QuerySysSensitiveBusiSVImpl implements IQuerySysSensitiveBusiSV {
	
	@Autowired 
	private transient ISysSensitiveAtomSV  iSysSensitiveAtomSV;


	@Override
	public PageInfo<SensitivePageVo> querySensitivePage(SensitivePageQueryRequest param) {
		PageInfo<SensitivePageVo> questionsPageInfo = iSysSensitiveAtomSV.querySensitivePage(param);
		return questionsPageInfo;
	}

}
