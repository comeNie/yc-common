package com.ai.yc.common.api.sysbasic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.common.api.sysbasic.interfaces.IQuerySysBasicSV;
import com.ai.yc.common.api.sysbasic.param.QuerySysBasicListRes;
import com.ai.yc.common.api.sysbasic.param.SysBasicVo;
import com.ai.yc.common.constants.ResultCodeConstants;
import com.ai.yc.common.dao.mapper.bo.SysBasic;
import com.ai.yc.common.service.business.sysbasic.IQuerySysBasicBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Description: 用途查询服务
 * @author hougang@asiainfo.com
 * @date 2016年11月1日 下午6:28:30 
 * @version V1.0
 */
@Service
@Component
public class QuerySysBasicSVImpl implements IQuerySysBasicSV {
	
	@Autowired
	private transient IQuerySysBasicBusiSV iQuerySysBasicBusiSV;

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

}
