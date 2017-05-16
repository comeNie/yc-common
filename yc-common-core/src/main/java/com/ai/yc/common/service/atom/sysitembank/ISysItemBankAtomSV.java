package com.ai.yc.common.service.atom.sysitembank;


import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageVo;
import com.ai.yc.common.dao.mapper.bo.SysItembank;

/**
 * @author shancc
 * @date 
 * @version V1.0
 */
public interface ISysItemBankAtomSV {
	

	PageInfo<ItemBankPageVo> queryItemBankPage(ItemBankPageQueryRequest param);

	Integer deleteSysItemBank(String bid);

	Integer saveSysItemBank(SysItembank sysItembank);

}
