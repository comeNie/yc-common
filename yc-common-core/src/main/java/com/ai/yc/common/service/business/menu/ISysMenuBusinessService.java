package com.ai.yc.common.service.business.menu;

import com.ai.yc.common.api.menu.param.SysMenuListQueryRequest;
import com.ai.yc.common.api.menu.param.SysMenuListQueryResponse;

public interface ISysMenuBusinessService {
	SysMenuListQueryResponse queryMenuByUserId(SysMenuListQueryRequest request);

}
