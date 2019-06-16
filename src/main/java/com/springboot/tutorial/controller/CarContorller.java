package com.springboot.tutorial.controller;

import com.springboot.tutorial.domain.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/6/16 15:28
 */
@RequestMapping(value = "/car", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class CarContorller {

	private static final Logger logger = LoggerFactory.getLogger(CarContorller.class);


	@GetMapping("/getCar")
	public Car getCar() {
		logger.info("invoke getCar method->info");
		logger.debug("invoke getCar method->debug");
		logger.error("invoke getCar method->error");
		logger.warn("invoke getCar method->warn");
		logger.trace("invoke getCar method->trace");

		return new Car("3", "卡迪拉克");
	}


}
