package com.ai.yc.common.service.atom.sysregist.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ai.yc.common.dao.mapper.bo.SysRegist;
import com.ai.yc.common.dao.mapper.bo.SysRegistCriteria;
import com.ai.yc.common.dao.mapper.factory.MapperFactory;
import com.ai.yc.common.dao.mapper.interfaces.SysRegistMapper;
import com.ai.yc.common.service.atom.sysregist.ISysRegistAtomSV;

/**
 * @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
@Service
public class SysRegistAtomSVImpl implements ISysRegistAtomSV{

	/**
	 * 查询基本设置
	 */
	@Override
	public List<SysRegist> querySysRegist() {
		SysRegistCriteria example = new SysRegistCriteria();
		return MapperFactory.getSysRegistMapper().selectByExample(example);
	}
	
	@Override
	public Integer updateSysRegist(SysRegist sysRegist) {
		SysRegistCriteria sysRegistCriteria = new SysRegistCriteria();
		SysRegistCriteria.Criteria criteria = sysRegistCriteria.createCriteria();
		criteria.andAidEqualTo(sysRegist.getAid());
		SysRegistMapper mapper = MapperFactory.getSysRegistMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysRegist, sysRegistCriteria);
		return updateByPrimaryKey;
	}
}
