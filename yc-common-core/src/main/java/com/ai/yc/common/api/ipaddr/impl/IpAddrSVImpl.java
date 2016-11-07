package com.ai.yc.common.api.ipaddr.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.common.api.ipaddr.interfaces.IIpAddrSV;
import com.ai.yc.common.api.ipaddr.param.IpAddr;
import com.ai.yc.common.service.business.ipaddr.IIpAddrBusiSV;
import com.ai.yc.common.util.VoValidateUtils;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class IpAddrSVImpl implements IIpAddrSV {
	@Autowired
	private IIpAddrBusiSV iIpAddrBusiSV;

	@Override
	public IpAddr getIpAddrByIp(String ip) {
		VoValidateUtils.validateGetIpAddrByIp(ip);
		return iIpAddrBusiSV.getIpAddrByIp(ip);
	}

}
