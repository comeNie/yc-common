package com.ai.yc.common.service.atom.sysduad.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ai.opt.sdk.util.StringUtil;
import com.ai.yc.common.constants.Constants;
import com.ai.yc.common.dao.mapper.bo.SysDuad;
import com.ai.yc.common.dao.mapper.bo.SysDuadCriteria;
import com.ai.yc.common.dao.mapper.factory.MapperFactory;
import com.ai.yc.common.service.atom.sysduad.ISysDuadAtomSV;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午7:54:25 
 * @version V1.0
 */
@Service
public class SysDuadAtomSVImpl implements ISysDuadAtomSV {

	@Override
	public List<SysDuad> querySysDuadList(String language, String orderType) {
		SysDuadCriteria example = new SysDuadCriteria();
		SysDuadCriteria.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(Constants.SysDuad.STATE_SHOW);
		if(!StringUtil.isBlank(language)){
			criteria.andLanguageEqualTo(language);
		}
		if(!StringUtil.isBlank(orderType)){
			criteria.andOrderTypeEqualTo(orderType);
		}
		example.setOrderByClause("sort DESC ,updatetime DESC");
		return MapperFactory.getSysDuadMapper().selectByExample(example);
	}

	@Override
	public SysDuad querySysDuadDetails(String duadId) {
		return  MapperFactory.getSysDuadMapper().selectByPrimaryKey(duadId);
	}

}
