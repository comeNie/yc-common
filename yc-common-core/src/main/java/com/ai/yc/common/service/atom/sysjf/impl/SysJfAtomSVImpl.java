package com.ai.yc.common.service.atom.sysjf.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
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
	public SysJf querySysJf() {
		SysJfCriteria sysJfCriteria = new SysJfCriteria();
		SysJfMapper mapper = MapperFactory.getSysJfMapper();
		List<SysJf> selectByExample = mapper.selectByExample(sysJfCriteria);
		SysJf sysJf = new SysJf();
		if(!CollectionUtil.isEmpty(selectByExample)){
			BeanUtils.copyProperties(sysJf, selectByExample.get(0));
		}
		return sysJf;
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
