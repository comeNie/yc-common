package com.ai.yc.common.service.atom.syspurpose;

import java.util.List;

import com.ai.opt.base.vo.PageInfo;
import com.ai.yc.common.api.syspurpose.param.CheckPurposeCn;
import com.ai.yc.common.api.syspurpose.param.DeleteSysPurpose;
import com.ai.yc.common.api.syspurpose.param.PurposePageQueryRequest;
import com.ai.yc.common.api.syspurpose.param.PurposePageVo;
import com.ai.yc.common.dao.mapper.bo.SysPurpose;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午6:35:25 
 * @version V1.0
 */
public interface ISysPurposeAtomSV {
	
	/**
	 * 查询页面显示的用途
	 */
	List<SysPurpose> querySysPurposeList(String language);
	
	SysPurpose selectByPrimaryKey(String purposeId);

	PageInfo<PurposePageVo> queryPurposePage(PurposePageQueryRequest param);

	Integer saveSysPurpose(SysPurpose sysPurpose);

	Integer deleteSysPurpose(String purposeId);

	List<PurposePageVo> querySysPurposeById(DeleteSysPurpose param);

	Integer updateSysPurpose(SysPurpose sysPurpose);

	Integer checkPurposeCn(CheckPurposeCn param);

}
