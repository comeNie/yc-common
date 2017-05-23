package com.ai.yc.common.api.sysconfig.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.common.api.sysconfig.interfaces.IQuerySysConfigSV;
import com.ai.yc.common.api.sysconfig.param.CommissionConfig;
import com.ai.yc.common.api.sysconfig.param.DonateIntegralConfig;
import com.ai.yc.common.api.sysconfig.param.HomeDataEidtConfig;
import com.ai.yc.common.api.sysconfig.param.MemberConfig;
import com.ai.yc.common.api.sysconfig.param.NoticeConfig;
import com.ai.yc.common.api.sysconfig.param.SaveSysConfig;
import com.ai.yc.common.constants.ResultCodeConstants;
import com.ai.yc.common.dao.mapper.bo.SysConfig;
import com.ai.yc.common.service.business.sysconfig.IQuerySysConfigBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Description: 会员基本配置查询服务实现
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午5:02:32 
 * @version V1.0
 */
@Service
@Component
public class QuerySysConfigSVImpl implements IQuerySysConfigSV {
	private static final Logger logger = Logger.getLogger(QuerySysConfigSVImpl.class);
	@Autowired
	private transient IQuerySysConfigBusiSV iQuerySysConfigBusiSV;

	@Override
	public MemberConfig getMemberConfig() throws BusinessException,
			SystemException {
		SysConfig config = iQuerySysConfigBusiSV.getSysCong();
		if(config==null){
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "配置信息不存在");
		}
		MemberConfig res  = new MemberConfig();
		BeanUtils.copyProperties(res, config);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
		
	}

	@Override
	public CommissionConfig getCommissionConfig() throws BusinessException,
			SystemException {
		SysConfig config = iQuerySysConfigBusiSV.getSysCong();
		if(config==null){
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "配置信息不存在");
		}
		CommissionConfig res  = new CommissionConfig();
		BeanUtils.copyProperties(res, config);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
		
	}

	@Override
	public HomeDataEidtConfig getHomeDataEidtConfig() throws BusinessException,
			SystemException {
		SysConfig config = iQuerySysConfigBusiSV.getSysCong();
		if(config==null){
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "配置信息不存在");
		}
		HomeDataEidtConfig res  = new HomeDataEidtConfig();
		BeanUtils.copyProperties(res, config);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public DonateIntegralConfig getDonateIntegralConfig()
			throws BusinessException, SystemException {
		SysConfig config = iQuerySysConfigBusiSV.getSysCong();
		if(config==null){
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "配置信息不存在");
		}
		DonateIntegralConfig res  = new DonateIntegralConfig();
		BeanUtils.copyProperties(res, config);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public NoticeConfig getNoticeConfig() throws BusinessException, SystemException {
		SysConfig config = iQuerySysConfigBusiSV.getSysCong();
		if(config==null){
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "配置信息不存在");
		}
		NoticeConfig res  = new NoticeConfig();
		BeanUtils.copyProperties(res, config);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public BaseResponse saveSysConfig(SaveSysConfig req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysConfigBusiSV.saveSysConfig(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("保存基本设置成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			logger.error(ExceptCodeConstants.Special.SYSTEM_ERROR, e);
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"保存基本设置失败");
		}
		return response;
	}

	

}
