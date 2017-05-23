package com.ai.yc.common.service.business.sysitembank.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.common.api.sysitembank.param.CheckDuad;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageVo;
import com.ai.yc.common.api.sysitembank.param.SaveSysItemBank;
import com.ai.yc.common.constants.Constants;
import com.ai.yc.common.dao.mapper.bo.SysItembank;
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


	@Override
	public Integer saveSysItemBank(SaveSysItemBank req) {
		SysItembank sysItembank = new SysItembank();
		BeanUtils.copyProperties(sysItembank,req);
		Long bId = SeqUtil.getNewId(Constants.SEQ.ITEMBANK_BID_SEQ);
		sysItembank.setBid(String.valueOf(bId));
		return iSysItemBankAtomSV.saveSysItemBank(sysItembank);
	}


	@Override
	public Integer deleteSysItemBank(String bid) {
		return iSysItemBankAtomSV.deleteSysItemBank(bid);
	}


	@Override
	public Integer updateSysItemBank(SaveSysItemBank req) {
		SysItembank sysItembank = new SysItembank();
		BeanUtils.copyProperties(sysItembank,req);
		return iSysItemBankAtomSV.updateSysItemBank(sysItembank);
	}


	@Override
	public Integer checkDuadCn(CheckDuad param) {
		return iSysItemBankAtomSV.checkDuadCn(param);
	}
}
