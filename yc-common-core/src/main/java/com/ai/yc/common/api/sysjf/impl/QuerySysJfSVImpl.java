package com.ai.yc.common.api.sysjf.impl;

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
import com.ai.yc.common.api.sysbasic.param.SaveSysBasic;
import com.ai.yc.common.api.sysjf.interfaces.IQuerySysJfSV;
import com.ai.yc.common.api.sysjf.param.QuerySysJfListRes;
import com.ai.yc.common.api.sysjf.param.SysJfVo;
import com.ai.yc.common.constants.ResultCodeConstants;
import com.ai.yc.common.dao.mapper.bo.SysJf;
import com.ai.yc.common.service.business.sysjf.IQuerySysJfBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Description: 用途查询服务
 * @author shancc
 * @date 2017年5月15日 
 * @version V1.0
 */
@Service
@Component
public class QuerySysJfSVImpl implements IQuerySysJfSV {
	
	@Autowired
	private transient IQuerySysJfBusiSV iQuerySysJfBusiSV;

	@Override
	public QuerySysJfListRes queryJf() throws BusinessException, SystemException {
		List<SysJf> jfs = iQuerySysJfBusiSV.querySysJf();
		List<SysJfVo> vos = new ArrayList<SysJfVo>();
		for(SysJf jf:jfs){
			SysJfVo vo = new SysJfVo();
			BeanUtils.copyProperties(vo, jf);
			vos.add(vo);
		}
		QuerySysJfListRes res = new QuerySysJfListRes();
		res.setJfs(vos);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}
	@Override
	public BaseResponse saveJf(SaveSysBasic req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysJfBusiSV.updateSysJf(req);
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.Special.SUCCESS);
			responseHeader.setResultMessage("修改用途成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptCodeConstants.Special.SYSTEM_ERROR,"修改用途失败");
		}
		return response;
	}
	

}
