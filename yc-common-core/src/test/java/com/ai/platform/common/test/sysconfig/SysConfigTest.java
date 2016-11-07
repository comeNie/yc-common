package com.ai.platform.common.test.sysconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.yc.common.api.sysconfig.interfaces.IQuerySysConfigSV;
import com.ai.yc.common.api.sysconfig.param.CommissionConfig;
import com.ai.yc.common.api.sysconfig.param.DonateIntegralConfig;
import com.ai.yc.common.api.sysconfig.param.HomeDataEidtConfig;
import com.ai.yc.common.api.sysconfig.param.MemberConfig;
import com.ai.yc.common.api.sysdomain.interfaces.IQuerySysDomainSV;
import com.ai.yc.common.api.sysdomain.param.QuerySysDomainListRes;
import com.ai.yc.common.api.sysduad.interfaces.IQuerySysDuadSV;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadDetailsRes;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadListReq;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadListRes;
import com.ai.yc.common.api.syspurpose.interfaces.IQuerySysPurposeSV;
import com.ai.yc.common.api.syspurpose.param.QuerySysPurposeListRes;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class SysConfigTest {
	
	@Autowired
	private IQuerySysConfigSV iQuerySysConfigSV;
	
	@Autowired
	private IQuerySysDuadSV iQuerySysDuadSV;
	
	@Autowired
	private IQuerySysPurposeSV iQuerySysPurposeSV;
	
	@Autowired
	private IQuerySysDomainSV iQuerySysDomainSV;
	
	private Gson gson = new Gson();
	
	@Test
	public void testGetConfig(){
		
		MemberConfig conf1 = iQuerySysConfigSV.getMemberConfig();
		System.out.println(conf1==null?null:gson.toJson(conf1));
		
		CommissionConfig conf2 = iQuerySysConfigSV.getCommissionConfig();
		System.out.println(conf2==null?null:gson.toJson(conf2));
		
		HomeDataEidtConfig conf3= iQuerySysConfigSV.getHomeDataEidtConfig();
		System.out.println(conf3==null?null:gson.toJson(conf3));
		
		DonateIntegralConfig conf4= iQuerySysConfigSV.getDonateIntegralConfig();
		System.out.println(conf4==null?null:gson.toJson(conf4));
		
	}
	
	@Test
	public void testSysDuad(){
		QuerySysDuadListReq req = new QuerySysDuadListReq();
		req.setLanguage("china");
		req.setOrderType(QuerySysDuadListReq.ORDER_TYPE_DOC);
		QuerySysDuadListRes res = iQuerySysDuadSV.querySysDuadList(req);
		System.out.println("res:"+gson.toJson(res));
		
		QuerySysDuadDetailsRes details = iQuerySysDuadSV.querySysDuadDetails("111");
		System.out.println("details:"+gson.toJson(details));
		
	}
	
	@Test
	public void testSysDomain(){
		QuerySysDomainListRes res = iQuerySysDomainSV.querySysDomainList("china");
		System.out.println("res:"+gson.toJson(res));
	}
	
	@Test
	public void testSysPurpose(){
		QuerySysPurposeListRes res = iQuerySysPurposeSV.querySysPurposeList("china");
		System.out.println("res:"+gson.toJson(res));
	}

}
