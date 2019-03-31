package com.springboot.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * springboot配置
 * @author: wangyong
 * @date: 2019/3/31 14:13
 */
@Configuration
public class SpringTutorialConfig {


	@Bean
	public SpringTutorialProperties properties(){
		return new SpringTutorialProperties();
	}

}
