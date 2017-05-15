package com.ai.yc.common.service.business.sysbasic;

import java.util.List;

import com.ai.yc.common.api.sysbasic.param.SaveSysBasic;
import com.ai.yc.common.dao.mapper.bo.SysBasic;

/**
* @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
public interface IQuerySysBasicBusiSV {
	
	/**
	 * 查询基本设置
	 */
	List<SysBasic> querySysBasic();
	
	Integer updateSysBasic(SaveSysBasic req);
}
