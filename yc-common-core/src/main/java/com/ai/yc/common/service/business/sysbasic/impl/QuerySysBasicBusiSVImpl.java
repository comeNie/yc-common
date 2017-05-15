package com.ai.yc.common.service.business.sysbasic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.yc.common.api.sysbasic.param.SaveSysBasic;
import com.ai.yc.common.dao.mapper.bo.SysBasic;
import com.ai.yc.common.service.atom.sysbasic.ISysBasicAtomSV;
import com.ai.yc.common.service.business.sysbasic.IQuerySysBasicBusiSV;

/**
* @author shancc
 * @date 2017年5月15日
 * @version V1.0.1
 */
@Service
public class QuerySysBasicBusiSVImpl implements IQuerySysBasicBusiSV {
	
	@Autowired 
	private transient ISysBasicAtomSV  iSysBasicAtomSV;

	@Override
	public SysBasic querySysBasic() {
		return iSysBasicAtomSV.querySysBasic();
	}

	@Override
	public Integer updateSysBasic(SaveSysBasic req) {
		SysBasic sysBasic = new SysBasic();
		sysBasic.setId(req.getId());
		sysBasic.setOrdinayryMember(req.getOrdinayryMember());
		sysBasic.setGoldMember(req.getGoldMember());
		sysBasic.setPlatinumMember(req.getPlatinumMember());
		sysBasic.setMasonyMember(req.getMasonyMember());
		sysBasic.setCapValue(req.getCapValue());
		sysBasic.setV1Points(req.getV1Points());
		sysBasic.setV2Points(req.getV2Points());
		sysBasic.setV3Points(req.getV3Points());
		sysBasic.setLspPoints(req.getLspPoints());
		sysBasic.setLgdateNum(req.getLgdateNum());
		sysBasic.setCustomNum(req.getCustomNum());
		sysBasic.setInterpreterNum(req.getInterpreterNum());
		sysBasic.setOrderNum(req.getOrderNum());
		sysBasic.setLanguageNum(req.getLanguageNum());
		sysBasic.setPcNotice(req.getPcNotice());
		sysBasic.setWapNotice(req.getWapNotice());
		return iSysBasicAtomSV.updateSysBasic(sysBasic);
	}


}
