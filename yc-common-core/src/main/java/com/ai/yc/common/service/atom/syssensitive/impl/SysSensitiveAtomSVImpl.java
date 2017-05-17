package com.ai.yc.common.service.atom.syssensitive.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.yc.common.api.syssensitive.param.SensitivePageQueryRequest;
import com.ai.yc.common.api.syssensitive.param.SensitivePageVo;
import com.ai.yc.common.dao.mapper.bo.SysSensitive;
import com.ai.yc.common.dao.mapper.bo.SysSensitiveCriteria;
import com.ai.yc.common.dao.mapper.factory.MapperFactory;
import com.ai.yc.common.dao.mapper.interfaces.SysSensitiveMapper;
import com.ai.yc.common.service.atom.syssensitive.ISysSensitiveAtomSV;

/**
 * @author shancc
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Service
public class SysSensitiveAtomSVImpl implements ISysSensitiveAtomSV{


	@Override
	public PageInfo<SensitivePageVo> querySensitivePage(SensitivePageQueryRequest param) throws BusinessException, SystemException{
		List<SensitivePageVo> sensitivePageVos = new ArrayList<SensitivePageVo>();
		SysSensitiveCriteria sysSensitiveCriteria = new SysSensitiveCriteria();
		SysSensitiveCriteria.Criteria criteria = sysSensitiveCriteria.createCriteria();
		
		if (!StringUtil.isBlank(param.getCreatPeople())) {
			criteria.andCreatPeopleLike(param.getCreatPeople());
		}
		if (!StringUtil.isBlank(param.getSensitiveWords())) {
			criteria.andSensitiveWordsLike(param.getSensitiveWords());
		}
		if (!StringUtil.isBlank(param.getSite())) {
			criteria.andSiteEqualTo(param.getSite());
		}
		if (!StringUtil.isBlank(param.getState())) {
			criteria.andStateEqualTo(param.getState());
		}
		PageInfo<SensitivePageVo> pageInfo = new PageInfo<SensitivePageVo>();
		SysSensitiveMapper mapper = MapperFactory.getSysSensitiveMapper();
		
		pageInfo.setCount(mapper.countByExample(sysSensitiveCriteria));

		if (param.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(param.getPageInfo().getPageNo());
			pageInfo.setPageSize(param.getPageInfo().getPageSize() == null ? 20
					: param.getPageInfo().getPageSize());
			sysSensitiveCriteria.setLimitStart(param.getPageInfo().getStartRowIndex());
			sysSensitiveCriteria.setLimitEnd(param.getPageInfo().getPageSize());
		}
		
		List<SysSensitive> selectByExample = mapper.selectByExample(sysSensitiveCriteria);
		if (!CollectionUtil.isEmpty(selectByExample)) {
			for (int i = 0; i < selectByExample.size(); i++) {
				SensitivePageVo sensitivePageVo = new SensitivePageVo();
				BeanUtils.copyProperties(sensitivePageVo, selectByExample.get(i));
				sensitivePageVos.add(sensitivePageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(sensitivePageVos);
		return pageInfo;
	}

}
