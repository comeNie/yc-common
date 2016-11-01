package com.ai.platform.common.api.sysconfig.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.platform.common.api.sysconfig.interfaces.IQuerySysConfigSV;
import com.ai.platform.common.api.sysconfig.param.CommissionConfig;
import com.ai.platform.common.api.sysconfig.param.DonateIntegralConfig;
import com.ai.platform.common.api.sysconfig.param.HomeDataEidtConfig;
import com.ai.platform.common.api.sysconfig.param.MemberConfig;
import com.ai.platform.common.constants.ResultCodeConstants;
import com.ai.platform.common.dao.mapper.bo.SysConfig;
import com.ai.platform.common.service.business.sysconfig.IQuerySysConfigBusiSV;
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

	

}
