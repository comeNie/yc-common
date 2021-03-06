package com.ai.yc.common.service.business.sysitembank;


import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.sysitembank.param.CheckDuad;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageVo;
import com.ai.yc.common.api.sysitembank.param.SaveSysItemBank;

/**
 * @author shancc
 * @date 
 * @version V1.0
 */
public interface IQuerySysItemBankBusiSV {

	PageInfo<ItemBankPageVo> queryItemBankPage(ItemBankPageQueryRequest param);

	Integer saveSysItemBank(SaveSysItemBank req);

	Integer deleteSysItemBank(String bid);

	Integer updateSysItemBank(SaveSysItemBank req);

	Integer checkDuadCn(CheckDuad param);

}
