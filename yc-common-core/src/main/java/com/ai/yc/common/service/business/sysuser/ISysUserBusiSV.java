package com.ai.yc.common.service.business.sysuser;

import com.ai.yc.common.api.sysuser.param.SysUserListQueryRequest;
import com.ai.yc.common.api.sysuser.param.SysUserListQueryResponse;
import com.ai.yc.common.api.sysuser.param.SysUserQueryRequest;
import com.ai.yc.common.api.sysuser.param.SysUserQueryResponse;
import com.ai.yc.common.api.sysuser.param.SysUserThemeRequest;
import com.ai.yc.common.api.sysuser.param.SysUserThemeResponse;


public interface ISysUserBusiSV {
	
	SysUserQueryResponse queryUser(SysUserQueryRequest request);
	
	
	SysUserThemeResponse queryUserTheme(SysUserThemeRequest requst);
	
	SysUserListQueryResponse queryUserByOfficeId(SysUserListQueryRequest request);
}
