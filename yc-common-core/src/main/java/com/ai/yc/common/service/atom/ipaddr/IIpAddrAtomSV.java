package com.ai.yc.common.service.atom.ipaddr;

import com.ai.yc.common.dao.mapper.bo.GnIpAddr;

public interface IIpAddrAtomSV {
	GnIpAddr getIpAddrByIp(String ip);
}
