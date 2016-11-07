/**
 * 
 */
package com.ai.yc.common.api.country.param;

import com.ai.opt.base.vo.BaseInfo;

/**
 * 国家查询参数<br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author xuyw
 */
public class CountryRequest extends BaseInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8664056421902288399L;
	/**
	 * ID
	 */
	private Integer id;
	/**
	 * 中文名称
	 */
	private String countryNameCn;
	/**
	 * 英文名称
	 */
	private String countryNameEn;
	/**
	 * 简称
	 */
	private String countryValue;
	/**
	 * 代码
	 */
	private String countryCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountryNameCn() {
		return countryNameCn;
	}

	public void setCountryNameCn(String countryNameCn) {
		this.countryNameCn = countryNameCn;
	}

	public String getCountryNameEn() {
		return countryNameEn;
	}

	public void setCountryNameEn(String countryNameEn) {
		this.countryNameEn = countryNameEn;
	}

	public String getCountryValue() {
		return countryValue;
	}

	public void setCountryValue(String countryValue) {
		this.countryValue = countryValue;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
