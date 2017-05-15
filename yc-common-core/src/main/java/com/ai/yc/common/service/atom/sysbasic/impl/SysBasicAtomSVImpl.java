package com.ai.yc.common.service.atom.sysbasic.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
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
	public SysBasic querySysBasic() {
		SysBasicCriteria sysBasicCriteria = new SysBasicCriteria();
		SysBasicMapper mapper = MapperFactory.getSysBasicMapper();
		List<SysBasic> selectByExample = mapper.selectByExample(sysBasicCriteria);
		SysBasic sysBasic = new SysBasic();
		if(!CollectionUtil.isEmpty(selectByExample)){
			BeanUtils.copyProperties(sysBasic, selectByExample.get(0));
		}
		return sysBasic;
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
