package com.springboot.tutorial.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * 配置
 * @author: wangyong
 * @date: 2019/3/31 14:09
 */
public class SpringTutorialProperties {

	@Value("${spring.application.name}")
	private String appName;


	public String getAppName() {
		return appName;
	}
}
