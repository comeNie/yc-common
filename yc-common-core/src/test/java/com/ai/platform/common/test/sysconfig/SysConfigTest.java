package com.ai.platform.common.test.sysconfig;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.base.vo.BaseListResponse;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.yc.common.api.cachekey.key.CacheKey;
import com.ai.yc.common.api.sysconfig.interfaces.IQuerySysConfigSV;
import com.ai.yc.common.api.sysconfig.param.CommissionConfig;
import com.ai.yc.common.api.sysconfig.param.DonateIntegralConfig;
import com.ai.yc.common.api.sysconfig.param.HomeDataEidtConfig;
import com.ai.yc.common.api.sysconfig.param.MemberConfig;
import com.ai.yc.common.api.sysconfig.param.NoticeConfig;
import com.ai.yc.common.api.sysdomain.interfaces.IQuerySysDomainSV;
import com.ai.yc.common.api.sysdomain.param.CheckDomainCn;
import com.ai.yc.common.api.sysdomain.param.DeleteSysDomain;
import com.ai.yc.common.api.sysdomain.param.DomainPageQueryResponse;
import com.ai.yc.common.api.sysdomain.param.DomainPageVo;
import com.ai.yc.common.api.sysdomain.param.DomainQueryRequest;
import com.ai.yc.common.api.sysdomain.param.QuerySysDomainDetailsRes;
import com.ai.yc.common.api.sysdomain.param.QuerySysDomainListReq;
import com.ai.yc.common.api.sysdomain.param.QuerySysDomainListRes;
import com.ai.yc.common.api.sysdomain.param.SaveSysDomain;
import com.ai.yc.common.api.sysduad.interfaces.IQuerySysDuadSV;
import com.ai.yc.common.api.sysduad.param.CheckDuadCn;
import com.ai.yc.common.api.sysduad.param.DuadPageQueryRequest;
import com.ai.yc.common.api.sysduad.param.DuadPageQueryResponse;
import com.ai.yc.common.api.sysduad.param.DuadPageVo;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadById;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadDetailsRes;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadListReq;
import com.ai.yc.common.api.sysduad.param.QuerySysDuadListRes;
import com.ai.yc.common.api.sysduad.param.SaveSysDuad;
import com.ai.yc.common.api.sysitembank.interfaces.IQuerySysItemBankSV;
import com.ai.yc.common.api.sysitembank.param.DeleteSysItemBank;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryResponse;
import com.ai.yc.common.api.sysitembank.param.SaveSysItemBank;
import com.ai.yc.common.api.syspurpose.interfaces.IQuerySysPurposeSV;
import com.ai.yc.common.api.syspurpose.param.CheckPurposeCn;
import com.ai.yc.common.api.syspurpose.param.DeleteSysPurpose;
import com.ai.yc.common.api.syspurpose.param.PurposePageQueryRequest;
import com.ai.yc.common.api.syspurpose.param.PurposePageQueryResponse;
import com.ai.yc.common.api.syspurpose.param.PurposePageVo;
import com.ai.yc.common.api.syspurpose.param.QuerySysPurposeListReq;
import com.ai.yc.common.api.syspurpose.param.QuerySysPurposeListRes;
import com.ai.yc.common.api.syspurpose.param.SaveSysPurpose;
import com.ai.yc.common.api.sysquestions.interfaces.IQuerySysQuestionsSV;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageQueryRequest;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageQueryResponse;
import com.ai.yc.common.api.sysquestions.param.QuestionsPapersResponse;
import com.ai.yc.common.api.sysquestions.param.SaveSysQuestions;
import com.ai.yc.common.api.syssensitive.interfaces.IQuerySysSensitiveSV;
import com.ai.yc.common.api.syssensitive.param.SensitivePageQueryRequest;
import com.ai.yc.common.api.syssensitive.param.SensitivePageQueryResponse;
import com.ai.yc.common.constants.CacheNSMapper;
import com.ai.yc.common.util.CacheFactoryUtil;
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
	
	@Autowired
	private IQuerySysItemBankSV iQuerySysItemBankSV;
	
	@Autowired
	private IQuerySysQuestionsSV iQuerySysQuestionsSV;
	
	@Autowired
	private IQuerySysSensitiveSV iQuerySysSensitiveSV;
	
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
		
		NoticeConfig conf5= iQuerySysConfigSV.getNoticeConfig();
		System.out.println(conf5==null?null:gson.toJson(conf5));
	}
	
	@Test
	public void testSysDuad(){
		QuerySysDuadListReq req = new QuerySysDuadListReq();
		req.setLanguage("zh_CN");
		req.setOrderType(QuerySysDuadListReq.ORDER_TYPE_DOC);
		QuerySysDuadListRes res = iQuerySysDuadSV.querySysDuadList(req);
		System.out.println("res:"+gson.toJson(res));
		
		QuerySysDuadDetailsRes details = iQuerySysDuadSV.querySysDuadDetails("111");
		System.out.println("details:"+gson.toJson(details));
		
	}
	
	@Test
	public void testSysDomain(){
		QuerySysDomainListReq req = new QuerySysDomainListReq();
		req.setLanguage("en_US");
		QuerySysDomainListRes res = iQuerySysDomainSV.querySysDomainList(req);
		System.out.println("res:"+gson.toJson(res));
		
		QuerySysDomainDetailsRes domain = iQuerySysDomainSV.querySysDomainDetails("1");
		System.out.println("res:"+gson.toJson(domain));
	}
	
	@Test
	public void testSysPurpose(){
		QuerySysPurposeListReq req = new QuerySysPurposeListReq();
		req.setLanguage("");
		QuerySysPurposeListRes res = iQuerySysPurposeSV.querySysPurposeList(req);
		System.out.println("res:"+gson.toJson(res));
	}
	
	@Test
	public void testCache(){
		ICacheClient cacheClient = CacheFactoryUtil.getCacheClient("us.ea."+ CacheNSMapper.CACHE_SYS_DUAD_RULE);
		String rs = cacheClient.hget(CacheKey.DUAD_L_KEY, "1");
		System.out.println("rs:"+rs);
	}
	/**
     * 同语言下的已存在相同名称的用途不可再次新建
	 */
	@Test
	public void checkPurposeCn(){
		CheckPurposeCn param = new CheckPurposeCn();
		param.setLanguage("2");
		param.setPurposeCn("语言");
		Integer checkPurposeCn = iQuerySysPurposeSV.checkPurposeCn(param);
		System.out.println(checkPurposeCn);
	}
	
	/**
     * 用途列表查询分页
	 */
	@Test
	public void queryPurposePage(){
		PurposePageQueryRequest param = new PurposePageQueryRequest();
		param.setPurposeCn("书");
		PurposePageQueryResponse queryPurposePage = iQuerySysPurposeSV.queryPurposePage(param);
		System.out.println(queryPurposePage);
	}
	
	/**
     * 添加用途
	 */
	@Test
	public void saveSysPurpose(){
		SaveSysPurpose req  = new SaveSysPurpose();
		req.setLanguage("en_US");
		req.setNamedFlag("1");
		req.setPurposeCn("译云");
		req.setPurposeEn("language");
		req.setRemarks("讨论");
		req.setSite("2");
		req.setSort("1");
		req.setState("0");
		BaseResponse saveSysPurpose = iQuerySysPurposeSV.saveSysPurpose(req);
		System.out.println(saveSysPurpose);
	}
	/**
     * 删除用途
	 */
	@Test
	public void deleteSysPurpose(){
		DeleteSysPurpose param = new DeleteSysPurpose();
		param.setPurposeId("4");
		Integer deleteSysPurpose = iQuerySysPurposeSV.deleteSysPurpose(param);
		System.out.println(deleteSysPurpose);
	}
	/**
     * 根据用途ID查询用途
	 */
	@Test
	public void querySysPurposeById(){
		DeleteSysPurpose param = new DeleteSysPurpose();
		param.setPurposeId("3");
		BaseListResponse<PurposePageVo> querySysPurposeById = iQuerySysPurposeSV.querySysPurposeById(param);
		System.out.println(querySysPurposeById);
	}
	/**
     * 修改用途
	 */
	@Test
	public void updateSysPurpose(){
		SaveSysPurpose req  = new SaveSysPurpose();
		req.setPurposeId("3");
		req.setLanguage("1");
		req.setNamedFlag("1");
		req.setPurposeCn("语言");
		req.setPurposeEn("language");
		req.setRemarks("讨论");
		req.setSite("2");
		req.setSort("1");
		req.setState("0");
		BaseResponse updateSysPurpose = iQuerySysPurposeSV.updateSysPurpose(req);
		System.out.println(updateSysPurpose);
	}
	
	/**
     * 语言对列表查询分页
	 */
	@Test
	public void queryDuadPage(){
		DuadPageQueryRequest param = new DuadPageQueryRequest();
		DuadPageQueryResponse queryDuadPage = iQuerySysDuadSV.queryDuadPage(param);
		System.out.println(queryDuadPage);
	}
	/**
     * 同语言下的已存在相同名称的语言对不可再次新建
	 */
	@Test
	public void checkDuadCn(){
		CheckDuadCn param = new CheckDuadCn();
		param.setLanguage("2");
		param.setSourceCn("中");
		param.setTargetCn("日");
		Integer checkDuadCn = iQuerySysDuadSV.checkDuadCn(param);
		System.out.println(checkDuadCn);
	}
	/**
     * 添加语言对
	 */
	@Test
	public void saveSysDuad(){
		SaveSysDuad req  = new SaveSysDuad();
		req.setLanguage("zh_CN");
		req.setOrderType("2");
		req.setOrdinary("0.4");
		req.setOrdinaryDollar("0.06");
		req.setOrdinaryUrgent("0.53");
		req.setOurgentDollar("0.04");
		req.setProfessional("0.28");
		req.setProfessionalDollar("0.05");
		req.setProfessionalUrgent("0.37");
		req.setPublish("0.45");
		req.setPublishDollar("0.07");
		req.setPublishUrgent("0.6");
		req.setPurgentDollar("0.06");
		req.setPuburgentDollar("0.09");
		req.setSite("pc");
		req.setSourceCode("zh");
		req.setSourceCn("中文");
		req.setSourceEn("Chinese");
		req.setTargetEn("English");
		req.setTargetCn("英文");
		req.setTargetCode("en");
		req.setState("0");
		/*req.setUpdatetime();*/
		BaseResponse saveSysDuad = iQuerySysDuadSV.saveSysDuad(req);
		System.out.println(saveSysDuad);
	}
	/**
     * 根据语言对ID查询用途
	 */
	@Test
	public void querySysDuadById(){
		QuerySysDuadById param = new QuerySysDuadById();
		param.setDuadId("113");
		BaseListResponse<DuadPageVo> querySysDuadById = iQuerySysDuadSV.querySysDuadById(param);
		System.out.println(querySysDuadById);
	}
	/**
     * 修改语言对
	 */
	@Test
	public void updateSysDuad(){
		SaveSysDuad req  = new SaveSysDuad();
		req.setDuadId("8");
		req.setLanguage("1");
		/*req.setOrderType("2");*/
		req.setOrdinary("0.4");
		req.setOrdinaryDollar("0.06");
		req.setOrdinaryUrgent("0.53");
		req.setOurgentDollar("0.04");
		req.setProfessional("0.28");
		req.setProfessionalDollar("0.05");
		req.setProfessionalUrgent("0.37");
		req.setPublish("0.45");
		req.setPublishDollar("0.07");
		req.setPublishUrgent("0.6");
		req.setPurgentDollar("0.06");
		req.setPuburgentDollar("0.09");
		req.setSite("3");
		req.setSourceCode("ru");
		req.setSourceCn("俄语");
		req.setSourceEn("Russian");
		req.setTargetEn("English");
		req.setTargetCn("英文");
		req.setTargetCode("en");
		req.setState("1");
		/*req.setUpdatetime();*/
		BaseResponse saveSysDuad = iQuerySysDuadSV.updateSysDuad(req);
		System.out.println(saveSysDuad);
	}
	
	/**
     * 领域列表查询分页
	 */
	@Test
	public void queryDomainPage(){
		DomainQueryRequest param = new DomainQueryRequest();
		param.setDomainCn("翻译");
		DomainPageQueryResponse queryDomainPage = iQuerySysDomainSV.queryDomainPage(param);
		System.out.println(queryDomainPage);
	}
	/**
     * 同语言下的已存在相同名称的领域不可再次新建
	 */
	@Test
	public void checkDomainCn(){
		CheckDomainCn param = new CheckDomainCn();
		param.setLanguage("2");
		param.setDomainCn("翻译");
		Integer checkDomainCn = iQuerySysDomainSV.checkDomainCn(param);
		System.out.println(checkDomainCn);
	}
	/**
     * 添加领域
	 */
	@Test
	public void saveSysDomain(){
		SaveSysDomain req  = new SaveSysDomain();
		req.setDomainCn("翻译4");
		req.setDomainEn("traslate3");
		req.setLanguage("en_US");
		req.setSite("1");
		req.setSort("1");
		req.setState("0");
		/*req.setUpdatetime();*/
		BaseResponse saveSysDomain = iQuerySysDomainSV.saveSysDomain(req);
		System.out.println(saveSysDomain);
	}
	/**
     * 删除领域
	 */
	@Test
	public void deleteSysDomain(){
		DeleteSysDomain param = new DeleteSysDomain();
		param.setDomainId("4");
		Integer deleteSysDomain = iQuerySysDomainSV.deleteSysDomain(param);
		System.out.println(deleteSysDomain);
	}
	/**
     * 根据领域ID查询用途
	 */
	@Test
	public void querySysDomainById(){
		DeleteSysDomain param = new DeleteSysDomain();
		param.setDomainId("4");
		BaseListResponse<DomainPageVo> querySysDomainById = iQuerySysDomainSV.querySysDomainById(param);
		System.out.println(querySysDomainById);
	}
	/**
     * 修改领域
	 */
	@Test
	public void updateSysDomain(){
		SaveSysDomain req  = new SaveSysDomain();
		req.setDomainCn("翻译3");
		req.setDomainEn("traslate3");
		req.setDomainId("4");
		req.setLanguage("en_US");
		req.setSite("1");
		req.setSort("1");
		req.setState("1");
		BaseResponse updateSysDomain = iQuerySysDomainSV.updateSysDomain(req);
		System.out.println(updateSysDomain);
	}
	
	
	/**
     * 题库查询
	 */
	@Test
	public void queryItemBankPage(){
		ItemBankPageQueryRequest param = new ItemBankPageQueryRequest();
		param.setSite("1");
		ItemBankPageQueryResponse queryItemBankPage = iQuerySysItemBankSV.queryItemBankPage(param);
		System.out.println(queryItemBankPage);
	}
	
	/**
     * 添加题库
	 */
	@Test
	public void saveSysItemBank(){
		SaveSysItemBank param = new SaveSysItemBank();
		param.setState("1");
		param.setSite("2");
		param.setQuestionType("2");
		param.setQname("翻译题");
		
		BaseResponse saveSysItemBank = iQuerySysItemBankSV.saveSysItemBank(param);
		System.out.println(saveSysItemBank);
	}
	/**
     * 逻辑删除题库
	 */
	@Test
	public void deleteSysItemBank(){
		DeleteSysItemBank param = new DeleteSysItemBank();
		param.setBid("5");
		Integer deleteSysItemBank = iQuerySysItemBankSV.deleteSysItemBank(param);
		System.out.println(deleteSysItemBank);
	}
	
	/**
     * 题目查询
	 */
	@Test
	public void queryQuestionsPage(){
		QuestionsPageQueryRequest param = new QuestionsPageQueryRequest();
		param.setBid("10");
		param.setQtype("1");
		Integer queryQuestionsNumber = iQuerySysQuestionsSV.queryQuestionsNumber(param);
		System.out.println(queryQuestionsNumber);
	}
	/**
     * 添加简答题目
	 */
	@Test
	public void saveSysQuestions(){
		SaveSysQuestions param = new SaveSysQuestions();
		param.setBid("11");
		param.setOriginal("目");
		param.setTranslation("mu");
		param.setQtype("1");
		BaseResponse saveSysQuestions = iQuerySysQuestionsSV.saveSysQuestions(param);
		System.out.println(saveSysQuestions);
	}
	/**
     * 添加选择题目
	 */
	@Test
	public void saveSysChioceQuestions(){
		SaveSysQuestions param = new SaveSysQuestions();
		param.setBid("11");
		param.setAnswer("A");
		param.setQtype("1");
		param.setChoiceQuestion("选择标题");
		param.setOptiona("1");
		param.setOptionb("2");
		param.setOptionc("3");
		param.setOptiond("4");
		param.setOptiona("5");
		param.setOptiona("6");
		param.setStatus("1");
		BaseResponse saveSysQuestions = iQuerySysQuestionsSV.saveSysQuestions(param);
		System.out.println(saveSysQuestions);
	}
	/**
     * 添加选择题目
	 */
	@Test
	public void updateSysQuestions(){
		SaveSysQuestions param = new SaveSysQuestions();
		param.setQid("8");
		param.setOptiona("a");
		param.setOptionb("s");
		param.setOptionc("d");
		param.setOptiond("b");
		param.setAnswer("A");
		param.setStatus("0");
		param.setChoiceQuestion("选择标题11");
		BaseResponse updateSysQuestions = iQuerySysQuestionsSV.updateSysQuestions(param);
		System.out.println(updateSysQuestions);
	}
	
	/**
     * 试卷生成
	 */
	@Test
	public void questionsPapers(){
		ItemBankPageQueryRequest param = new ItemBankPageQueryRequest();
		param.setLangDir("8");
		param.setSite("1");
		QuestionsPapersResponse questionsPapers = iQuerySysQuestionsSV.questionsPapers(param);
		System.out.println(questionsPapers);
	}
	
	/**
     * 敏感词查询
	 */
	@Test
	public void querySensitivePage(){
		SensitivePageQueryRequest param = new SensitivePageQueryRequest();
		param.setSensitiveWords("狗");
		param.setSite("1");
		param.setState("1");
		SensitivePageQueryResponse querySensitivePage = iQuerySysSensitiveSV.querySensitivePage(param);
		System.out.println(querySensitivePage);
	}
	
	/**
	 * 时间转换
	 */
	@Test
	public void date(){
		Timestamp sysDate = DateUtil.getSysDate();
		System.out.println("sysDate = "+sysDate);
		
		long sqlLastTime = sysDate.getTime();// 直接转换成long
		System.out.println("sqlLastTime = "+sqlLastTime); //毫秒数
		
		
		long i = sysDate.getTime();
		Timestamp timestamp = new Timestamp(i);
		System.out.println(timestamp);
	}

}
