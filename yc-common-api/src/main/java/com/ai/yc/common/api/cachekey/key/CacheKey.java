package com.ai.yc.common.api.cachekey.key;

import java.io.Serializable;

/**
 * @Description: 缓存键值
 * @author hougang@asiainfo.com
 * @date 2016年11月3日 上午10:35:19 
 * @version V1.0
 */
/**
 * @Description: TODO
 * @author hougang@asiainfo.com
 * @date 2016年11月21日 下午3:19:26 
 * @version V1.0
 */
public class CacheKey implements Serializable {

	private static final long serialVersionUID = 3633287499459454094L;
	
	/**
	 * 语言对
	 */
	public static final String DUAD_L_NAMESPACE = "DUAD_L";
	
	public static final String DUAD_D_NAMESPACE = "DUAD_D";
	
	/**
	 * 领域
	 */
    public static final String DOMAIN_L_NAMESPACE = "DOMAIN_L"; 
    
    public static final String DOMAIN_L_KEY = "ALL"; 
    
	public static final String DOMAIN_D_NAMESPACE = "DOMAIN_D";
	
	/**
	 * 用途
	 */
    public static final String PURPOSE_L_NAMESPACE = "PURPOSE_L"; 
    
    public static final String PURPOSE_L_KEY = "ALL"; 
    
	public static final String PURPOSE_D_NAMESPACE = "PURPOSE_D";
	
	/**
	 * 首页数据配置
	 */
	public static final String HOME_DATA_CONFIG_KEY = "HOME_DATA_CONFIG";

}
