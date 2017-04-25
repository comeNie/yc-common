package com.ai.yc.common.service.business.syspurpose;

import java.util.List;

import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.syspurpose.param.CheckPurposeCn;
import com.ai.yc.common.api.syspurpose.param.DeleteSysPurpose;
import com.ai.yc.common.api.syspurpose.param.PurposePageQueryRequest;
import com.ai.yc.common.api.syspurpose.param.PurposePageVo;
import com.ai.yc.common.api.syspurpose.param.SaveSysPurpose;
import com.ai.yc.common.dao.mapper.bo.SysPurpose;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午6:32:12 
 * @version V1.0
 */
public interface IQuerySysPurposeBusiSV {
	
	/**
	 * 查询页面显示的用途
	 */
	List<SysPurpose> querySysPurposeList(String language);
	
	SysPurpose querySysPurposeDetails(String purposeId);

	PageInfo<PurposePageVo> queryPurposePage(PurposePageQueryRequest param);

	Integer saveSysPurpose(SaveSysPurpose req);

	Integer deleteSysPurpose(String purposeId);

	List<PurposePageVo> querySysPurposeById(DeleteSysPurpose param);

	Integer updateSysPurpose(SaveSysPurpose req);

	Integer checkPurposeCn(CheckPurposeCn param);

}
