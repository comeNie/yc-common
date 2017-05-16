package com.ai.yc.common.service.atom.sysconfig;

import com.ai.yc.common.dao.mapper.bo.SysConfig;

/**
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午5:16:13 
 * @version V1.0
 */
public interface ISysConfigAtomSV {
	
	SysConfig selectOne();
	SysConfig changeOne();
	Integer saveSysConfig(SysConfig sysConfig);

}
