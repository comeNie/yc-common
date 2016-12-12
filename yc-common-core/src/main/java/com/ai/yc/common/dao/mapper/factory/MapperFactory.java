package com.ai.yc.common.dao.mapper.factory;


import javax.annotation.PostConstruct;

import com.ai.yc.common.dao.mapper.interfaces.*;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MapperFactory {

    private static SqlSessionTemplate sqlSessionTemplate;
    
    @Autowired
    private SqlSessionTemplate st;

    @PostConstruct
    void init() {
        setSqlSessionTemplate(st);
    }
    
    public static SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        MapperFactory.sqlSessionTemplate = sqlSessionTemplate;
    }

    public static SysOfficeMapper getSysOfficeMapper(){
    	return sqlSessionTemplate.getMapper(SysOfficeMapper.class);
    }
    
    public static SysUserMapper getSysUserMapper(){
    	return sqlSessionTemplate.getMapper(SysUserMapper.class);
    }
    
    public static SysWaitjobsMapper getSysWaitjobsMapper(){
    	return sqlSessionTemplate.getMapper(SysWaitjobsMapper.class);
    }
    
    public static GnSysParamMapper getGnSysParamMapper() {
        return sqlSessionTemplate.getMapper(GnSysParamMapper.class);
    }

    public static GnAreaMapper getGnAreaMapper() {
        return sqlSessionTemplate.getMapper(GnAreaMapper.class);
    }

    public static GnSubjectMapper getGnSubjectMapper() {
        return sqlSessionTemplate.getMapper(GnSubjectMapper.class);
    }

    public static GnSubjectFundMapper getGnSubjectFundMapper() {
        return sqlSessionTemplate.getMapper(GnSubjectFundMapper.class);
    }

    public static GnSettleRuleMapper getGnSettleRuleMapper() {
        return sqlSessionTemplate.getMapper(GnSettleRuleMapper.class);
    }
    
    public static GnTenantMapper getGnTenantMapper() {
        return sqlSessionTemplate.getMapper(GnTenantMapper.class);
    }
    public static GnIpAddrMapper getGnIpAddrMapper() {
    	return sqlSessionTemplate.getMapper(GnIpAddrMapper.class);
    }
    
    public static GnServiceNumMapper getGnServiceNumMapper() {
    	return sqlSessionTemplate.getMapper(GnServiceNumMapper.class);
    }

    public static GnIndustryMapper getGnIndustryMapper() {
        return sqlSessionTemplate.getMapper(GnIndustryMapper.class);
    }
    
    public static SysMenuMapper getSysMenuMapper() {
        return sqlSessionTemplate.getMapper(SysMenuMapper.class);
    }
    
    public static SysConfigMapper getSysConfigMapper() {
        return sqlSessionTemplate.getMapper(SysConfigMapper.class);
    }
    
    public static SysDuadMapper getSysDuadMapper() {
        return sqlSessionTemplate.getMapper(SysDuadMapper.class);
    }
    
    public static SysPurposeMapper getSysPurposeMapper() {
        return sqlSessionTemplate.getMapper(SysPurposeMapper.class);
    }
    
    public static SysDomainMapper getSysDomainMapper() {
        return sqlSessionTemplate.getMapper(SysDomainMapper.class);
    }
    public static GnCountryMapper getGnCountryMapper() {
        return sqlSessionTemplate.getMapper(GnCountryMapper.class);
    }

    public static GnRegionMapper getGnRegionMapper(){
        return sqlSessionTemplate.getMapper(GnRegionMapper.class);
    }
    
    
}
