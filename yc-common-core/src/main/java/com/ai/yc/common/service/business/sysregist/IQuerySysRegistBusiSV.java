package com.ai.yc.common.service.business.sysregist;

import java.util.List;

import com.ai.yc.common.api.sysbasic.param.SaveSysBasic;
import com.ai.yc.common.dao.mapper.bo.SysRegist;

/**
* @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
public interface IQuerySysRegistBusiSV {
	
	/**
	 * 查询基本设置
	 */
	List<SysRegist> querySysRegist();
	
	Integer updateSysRegist(SaveSysBasic req);
}
