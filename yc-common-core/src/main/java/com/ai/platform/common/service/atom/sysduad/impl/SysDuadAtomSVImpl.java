package com.ai.platform.common.service.atom.sysduad.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ai.platform.common.constants.Constants;
import com.ai.platform.common.dao.mapper.bo.SysDuad;
import com.ai.platform.common.dao.mapper.bo.SysDuadCriteria;
import com.ai.platform.common.dao.mapper.factory.MapperFactory;
import com.ai.platform.common.service.atom.sysduad.ISysDuadAtomSV;

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
		criteria.andLanguageEqualTo(language);
		criteria.andOrderTypeEqualTo(orderType);
		return MapperFactory.getSysDuadMapper().selectByExample(example);
	}

	@Override
	public SysDuad querySysDuadDetails(String duadId) {
		return  MapperFactory.getSysDuadMapper().selectByPrimaryKey(duadId);
	}

}
