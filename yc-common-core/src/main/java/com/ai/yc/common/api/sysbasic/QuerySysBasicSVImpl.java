package com.ai.yc.common.api.sysbasic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.common.api.sysbasic.interfaces.IQuerySysBasicSV;
import com.ai.yc.common.api.sysbasic.param.QuerySysBasicJfRegistListRes;
import com.ai.yc.common.api.sysbasic.param.QuerySysBasicListRes;
import com.ai.yc.common.api.sysbasic.param.SaveSysBasic;
import com.ai.yc.common.api.sysbasic.param.SysBasicJfRegistVo;
import com.ai.yc.common.api.sysbasic.param.SysBasicVo;
import com.ai.yc.common.constants.ResultCodeConstants;
import com.ai.yc.common.dao.mapper.bo.SysBasic;
import com.ai.yc.common.dao.mapper.bo.SysJf;
import com.ai.yc.common.dao.mapper.bo.SysRegist;
import com.ai.yc.common.service.business.sysbasic.IQuerySysBasicBusiSV;
import com.ai.yc.common.service.business.sysjf.IQuerySysJfBusiSV;
import com.ai.yc.common.service.business.sysregist.IQuerySysRegistBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Description: 用途查询服务
 * @author shancc
 * @date 2017年5月15日 
 * @version V1.0
 */
@Service
@Component
public class QuerySysBasicSVImpl implements IQuerySysBasicSV {
	
	@Autowired
	private transient IQuerySysBasicBusiSV iQuerySysBasicBusiSV;
	
	@Autowired
	private transient IQuerySysJfBusiSV iQuerySysJfBusiSV;
	
	@Autowired
	private transient IQuerySysRegistBusiSV iQuerySysRegistBusiSV;

	@Override
	public QuerySysBasicListRes queryBasic() throws BusinessException, SystemException {
		List<SysBasic> basics = iQuerySysBasicBusiSV.querySysBasic();
		List<SysBasicVo> vos = new ArrayList<SysBasicVo>();
		for(SysBasic basic:basics){
			SysBasicVo vo = new SysBasicVo();
			BeanUtils.copyProperties(vo, basic);
			vos.add(vo);
		}
		QuerySysBasicListRes res = new QuerySysBasicListRes();
		res.setBasics(vos);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public BaseResponse saveBasic(SaveSysBasic req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysBasicBusiSV.updateSysBasic(req);
			iQuerySysJfBusiSV.updateSysJf(req);
			iQuerySysRegistBusiSV.updateSysRegist(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("保存基本设置成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"保存基本设置失败");
		}
		return response;
	}

	@Override
	public QuerySysBasicJfRegistListRes queryBasicJfRegist() throws BusinessException, SystemException {
		List<SysBasic> basics = iQuerySysBasicBusiSV.querySysBasic();
		List<SysJf> jfs = iQuerySysJfBusiSV.querySysJf();
		List<SysRegist> regists = iQuerySysRegistBusiSV.querySysRegist();
		
		List<SysBasicJfRegistVo> vos = new ArrayList<SysBasicJfRegistVo>();
		SysBasicJfRegistVo vo = new SysBasicJfRegistVo();
		for(SysBasic basic:basics){
			vo.setId(basic.getId());
			vo.setOrdinayryMember(basic.getOrdinayryMember());
			vo.setGoldMember(basic.getGoldMember());
			vo.setPlatinumMember(basic.getPlatinumMember());
			vo.setMasonyMember(basic.getMasonyMember());
			vo.setCapValue(basic.getCapValue());
			vo.setV1Points(basic.getV1Points());
			vo.setV2Points(basic.getV2Points());
			vo.setV3Points(basic.getV3Points());
			vo.setLspPoints(basic.getLspPoints());
			vo.setLgdateNum(basic.getLgdateNum());
			vo.setCustomNum(basic.getCustomNum());
			vo.setInterpreterNum(basic.getInterpreterNum());
			vo.setOrderNum(basic.getOrderNum());
			vo.setLanguageNum(basic.getLanguageNum());
			vo.setPcNotice(basic.getPcNotice());
			vo.setWapNotice(basic.getWapNotice());
			vos.add(vo);
		}
		for (SysJf jf:jfs) {
			vo.setDid(jf.getDid());
			vo.setOneDay(jf.getOneDay());
			vo.setTwoDay(jf.getTwoDay());
			vo.setThreeDay(jf.getThreeDay());
			vo.setFourDay(jf.getFourDay());
			vo.setFiveDay(jf.getFiveDay());
			vo.setSixDay(jf.getSixDay());
			vo.setSevenDay(jf.getSevenDay());
			vo.setDstate(jf.getState());
			vos.add(vo);
		}
		for (SysRegist regist:regists) {
			vo.setActiviceName(regist.getActiviceName());
			vo.setActiviceNum(regist.getActiviceNum());
			vo.setAid(regist.getAid());
			vo.setAstate(regist.getState());
			vos.add(vo);
		}
		QuerySysBasicJfRegistListRes res = new QuerySysBasicJfRegistListRes();
		res.setBasicjfregists(vos);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

}
