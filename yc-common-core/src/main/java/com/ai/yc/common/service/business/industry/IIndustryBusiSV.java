package com.ai.yc.common.service.business.industry;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.common.api.industry.param.IndustryQueryResponse;

public interface IIndustryBusiSV {

    List<IndustryQueryResponse> queryIndustryList() throws BusinessException,SystemException;
    
    
    IndustryQueryResponse queryByIndustryCode(String industryCode)throws BusinessException,SystemException;
}
