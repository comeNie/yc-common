package com.ai.yc.common.service.atom.sysjf.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ai.yc.common.dao.mapper.bo.SysJf;
import com.ai.yc.common.dao.mapper.bo.SysJfCriteria;
import com.ai.yc.common.dao.mapper.factory.MapperFactory;
import com.ai.yc.common.dao.mapper.interfaces.SysJfMapper;
import com.ai.yc.common.service.atom.sysjf.ISysJfAtomSV;

/**
 * @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
@Service
public class SysJfAtomSVImpl implements ISysJfAtomSV{

	/**
	 * 查询基本设置
	 */
	@Override
	public List<SysJf> querySysJf() {
		SysJfCriteria example = new SysJfCriteria();
		return MapperFactory.getSysJfMapper().selectByExample(example);
	}
	
	@Override
	public Integer updateSysJf(SysJf sysJf) {
		SysJfCriteria sysJfCriteria = new SysJfCriteria();
		SysJfCriteria.Criteria criteria = sysJfCriteria.createCriteria();
		/*if(sysJf.getDid() != null){
			criteria.andDidEqualTo(sysJf.getDid());
			SysJfMapper mapper = MapperFactory.getSysJfMapper();
			int updateByPrimaryKey = mapper.updateByExampleSelective(sysJf, sysJfCriteria);
			return updateByPrimaryKey;
		}else{
			SysJfMapper mapper = MapperFactory.getSysJfMapper();
			int insertSelective = mapper.insertSelective(sysJf);
			return insertSelective;
		}*/
		criteria.andDidEqualTo(sysJf.getDid());
		SysJfMapper mapper = MapperFactory.getSysJfMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysJf, sysJfCriteria);
		return updateByPrimaryKey;
	}
}
