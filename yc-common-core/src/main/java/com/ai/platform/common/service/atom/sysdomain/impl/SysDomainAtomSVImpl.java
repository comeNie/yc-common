package com.ai.platform.common.service.atom.sysdomain.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.platform.common.constants.Constants;
import com.ai.platform.common.dao.mapper.bo.SysDomain;
import com.ai.platform.common.dao.mapper.bo.SysDomainCriteria;
import com.ai.platform.common.dao.mapper.factory.MapperFactory;
import com.ai.platform.common.service.atom.sysdomain.ISysDomainAtomSV;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午6:11:57 
 * @version V1.0
 */
@Service
@Transactional
public class SysDomainAtomSVImpl implements ISysDomainAtomSV{
	
	/**
	 * 获取显示的列表
	 */
	@Override
	public List<SysDomain> querySysDomainList(String language) {
		SysDomainCriteria example = new SysDomainCriteria();
		SysDomainCriteria.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(Constants.SysConfig.STATE_SHOW);
		criteria.andLanguageEqualTo(language);
		return MapperFactory.getSysDomainMapper().selectByExample(example);
	}

}
