package com.ai.yc.common.service.business.syspurpose.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.common.api.syspurpose.param.DeleteSysPurpose;
import com.ai.yc.common.api.syspurpose.param.PurposePageQueryRequest;
import com.ai.yc.common.api.syspurpose.param.PurposePageVo;
import com.ai.yc.common.api.syspurpose.param.SaveSysPurpose;
import com.ai.yc.common.dao.mapper.bo.SysPurpose;
import com.ai.yc.common.service.atom.syspurpose.ISysPurposeAtomSV;
import com.ai.yc.common.service.business.syspurpose.IQuerySysPurposeBusiSV;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午6:33:45 
 * @version V1.0
 */
@Service
public class QuerySysPurposeBusiSVImpl implements IQuerySysPurposeBusiSV {
	
	@Autowired 
	private transient ISysPurposeAtomSV  iSysPurposeAtomSV;

	@Override
	public List<SysPurpose> querySysPurposeList(String language) {
		
		return iSysPurposeAtomSV.querySysPurposeList(language);
	}

	@Override
	public SysPurpose querySysPurposeDetails(String purposeId) {

		return iSysPurposeAtomSV.selectByPrimaryKey(purposeId);
	}

	@Override
	public PageInfo<PurposePageVo> queryPurposePage(PurposePageQueryRequest param) {
		PageInfo<PurposePageVo> purposePageInfo = iSysPurposeAtomSV.queryPurposePage(param);
		return purposePageInfo;
	}

	@Override
	public Integer saveSysPurpose(SaveSysPurpose req) {
		SysPurpose sysPurpose = new SysPurpose();
		sysPurpose.setPurposeId(req.getPurposeId());
		sysPurpose.setLanguage(req.getLanguage());
		sysPurpose.setNamedFlag(req.getNamedFlag());
		sysPurpose.setPurposeCn(req.getPurposeCn());
		sysPurpose.setPurposeEn(req.getPurposeEn());
		sysPurpose.setRemarks(req.getRemarks());
		sysPurpose.setSite(req.getSite());
		sysPurpose.setSort(req.getSort());
		sysPurpose.setState(req.getState());
		/*sysPurpose.setUpdatetime(DateUtil.getSysDate());*/
		return iSysPurposeAtomSV.saveSysPurpose(sysPurpose);
	}

	@Override
	public Integer deleteSysPurpose(String purposeId) {
		return iSysPurposeAtomSV.deleteSysPurpose(purposeId);
	}

	@Override
	public List<PurposePageVo> querySysPurposeById(DeleteSysPurpose param) {
		return iSysPurposeAtomSV.querySysPurposeById(param);
	}

	@Override
	public Integer updateSysPurpose(SaveSysPurpose req) {
		SysPurpose sysPurpose = new SysPurpose();
		BeanUtils.copyProperties(sysPurpose,req);
		return iSysPurposeAtomSV.updateSysPurpose(sysPurpose);
	}

}
