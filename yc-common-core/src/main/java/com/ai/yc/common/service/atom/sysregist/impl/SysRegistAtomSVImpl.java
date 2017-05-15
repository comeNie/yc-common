package com.ai.yc.common.service.atom.sysregist.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
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
	public SysRegist querySysRegist() {
		SysRegistCriteria sysRegistCriteria = new SysRegistCriteria();
		SysRegistMapper mapper = MapperFactory.getSysRegistMapper();
		List<SysRegist> selectByExample = mapper.selectByExample(sysRegistCriteria);
		SysRegist sysRegist = new SysRegist();
		if(!CollectionUtil.isEmpty(selectByExample)){
			BeanUtils.copyProperties(sysRegist, selectByExample.get(0));
		}
		return sysRegist;
	}
	
	@Override
	public Integer updateSysRegist(SysRegist sysRegist) {
		SysRegistCriteria sysRegistCriteria = new SysRegistCriteria();
		SysRegistCriteria.Criteria criteria = sysRegistCriteria.createCriteria();
		if(sysRegist.getAid() != null){
			criteria.andAidEqualTo(sysRegist.getAid());
			SysRegistMapper mapper = MapperFactory.getSysRegistMapper();
			int updateByPrimaryKey = mapper.updateByExampleSelective(sysRegist, sysRegistCriteria);
			return updateByPrimaryKey;
		}else{
			SysRegistMapper mapper = MapperFactory.getSysRegistMapper();
			sysRegist.setAid("1");
			int insertSelective = mapper.insertSelective(sysRegist);
			return insertSelective;
		}
	}
}
