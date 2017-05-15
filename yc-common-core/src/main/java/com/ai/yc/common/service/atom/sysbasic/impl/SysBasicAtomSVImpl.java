package com.ai.yc.common.service.atom.sysbasic.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ai.yc.common.dao.mapper.bo.SysBasic;
import com.ai.yc.common.dao.mapper.bo.SysBasicCriteria;
import com.ai.yc.common.dao.mapper.factory.MapperFactory;
import com.ai.yc.common.dao.mapper.interfaces.SysBasicMapper;
import com.ai.yc.common.service.atom.sysbasic.ISysBasicAtomSV;

/**
 * @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
@Service
public class SysBasicAtomSVImpl implements ISysBasicAtomSV{

	/**
	 * 查询基本设置
	 */
	@Override
	public List<SysBasic> querySysBasic() {
		SysBasicCriteria example = new SysBasicCriteria();
		return MapperFactory.getSysBasicMapper().selectByExample(example);
	}
	
	@Override
	public Integer updateSysBasic(SysBasic sysBasic) {
		SysBasicCriteria sysBasicCriteria = new SysBasicCriteria();
		SysBasicCriteria.Criteria criteria = sysBasicCriteria.createCriteria();
		criteria.andIdEqualTo(sysBasic.getId());
		SysBasicMapper mapper = MapperFactory.getSysBasicMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysBasic, sysBasicCriteria);
		return updateByPrimaryKey;
	}
}
