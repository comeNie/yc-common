package com.ai.yc.common.service.atom.sysregist;


import com.ai.yc.common.dao.mapper.bo.SysRegist;

/**
 * @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
public interface ISysRegistAtomSV {
	
	/**
	 * 查询基本设置
	 */
	SysRegist querySysRegist();
	
	Integer updateSysRegist(SysRegist sysRegist);
}
