package com.ai.platform.common.test.country;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.yc.common.api.country.interfaces.IGnCountrySV;
import com.ai.yc.common.api.country.param.CountryRequest;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class CountryTest {
	@Autowired
	IGnCountrySV gnCountrySV;

	@Test
	public void testQuery() {
		CountryRequest request = new CountryRequest();
		System.err
				.println(JSON.toJSONString(gnCountrySV.queryCountry(request)));
	}
}
