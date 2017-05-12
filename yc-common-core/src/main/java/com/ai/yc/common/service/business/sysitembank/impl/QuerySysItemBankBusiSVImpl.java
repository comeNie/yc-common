package com.ai.yc.common.service.business.sysitembank.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageVo;
import com.ai.yc.common.service.atom.sysitembank.ISysItemBankAtomSV;
import com.ai.yc.common.service.business.sysitembank.IQuerySysItemBankBusiSV;

/**
 * @author shancc
 * @date 
 * @version V1.0
 */
@Service
public class QuerySysItemBankBusiSVImpl implements IQuerySysItemBankBusiSV {
	
	@Autowired 
	private transient ISysItemBankAtomSV  iSysItemBankAtomSV;


	@Override
	public PageInfo<ItemBankPageVo> queryItemBankPage(ItemBankPageQueryRequest param) {
		PageInfo<ItemBankPageVo> itemBankPageInfo = iSysItemBankAtomSV.queryItemBankPage(param);
		return itemBankPageInfo;
	}
}
