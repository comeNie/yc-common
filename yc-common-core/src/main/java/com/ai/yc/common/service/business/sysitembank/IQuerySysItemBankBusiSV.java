package com.ai.yc.common.service.business.sysitembank;


import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageVo;

/**
 * @author shancc
 * @date 
 * @version V1.0
 */
public interface IQuerySysItemBankBusiSV {

	PageInfo<ItemBankPageVo> queryItemBankPage(ItemBankPageQueryRequest param);

}
