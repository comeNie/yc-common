package com.ai.yc.common.service.business.servicenum;

import com.ai.yc.common.api.servicenum.param.ServiceNum;

public interface IServiceNumBusiSV {
	ServiceNum getServiceNumByPhone(String phone);
}
