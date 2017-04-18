package com.ai.yc.common.service.business.sysdomain.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.common.api.sysdomain.param.DeleteSysDomain;
import com.ai.yc.common.api.sysdomain.param.DomainPageVo;
import com.ai.yc.common.api.sysdomain.param.DomainQueryRequest;
import com.ai.yc.common.api.sysdomain.param.SaveSysDomain;
import com.ai.yc.common.dao.mapper.bo.SysDomain;
import com.ai.yc.common.service.atom.sysdomain.ISysDomainAtomSV;
import com.ai.yc.common.service.business.sysdomain.IQuerySysDomainBusiSV;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午5:58:51 
 * @version V1.0
 */
@Service
public class IQuerySysDomainBusiSVImpl implements IQuerySysDomainBusiSV {
	
	@Autowired
	private transient ISysDomainAtomSV iSysDomainAtomSV;

	@Override
	public List<SysDomain> querySysDomainList(String language) {
		return iSysDomainAtomSV.querySysDomainList(language);
	}

	@Override
	public SysDomain querySysDomainDetails(String domainId) {
		return iSysDomainAtomSV.selectByPrimaryKey(domainId);
	}

	@Override
	public PageInfo<DomainPageVo> queryDomainPage(DomainQueryRequest param) {
		PageInfo<DomainPageVo> domainPageInfo = iSysDomainAtomSV.queryDomainPage(param);
		return domainPageInfo;
	}

	@Override
	public Integer saveSysDomain(SaveSysDomain req) {
		SysDomain sysDomain = new SysDomain();
		sysDomain.setDomainId(req.getDomainId());
		sysDomain.setLanguage(req.getLanguage());
		sysDomain.setDomainCn(req.getDomainCn());
		sysDomain.setDomainEn(req.getDomainEn());
		sysDomain.setRemarks(req.getRemarks());
		sysDomain.setSite(req.getSite());
		sysDomain.setSort(req.getSort());
		sysDomain.setState(req.getState());
		/*sysPurpose.setUpdatetime(DateUtil.getSysDate());*/
		return iSysDomainAtomSV.saveSysDomain(sysDomain);
	}

	@Override
	public Integer deleteSysDomain(String domainId) {
		return iSysDomainAtomSV.deleteSysDomain(domainId);
	}

	@Override
	public List<DomainPageVo> querySysDomainById(DeleteSysDomain param) {
		return iSysDomainAtomSV.querySysDomainById(param);
	}

	@Override
	public Integer updateSysDomain(SaveSysDomain req) {
		SysDomain sysDomain = new SysDomain();
		BeanUtils.copyProperties(sysDomain,req);
		return iSysDomainAtomSV.updateSysDomain(sysDomain);
	}

}
