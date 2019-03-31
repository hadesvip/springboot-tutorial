package com.springboot.tutorial.controller;

import com.springboot.tutorial.config.SpringTutorialProperties;
import com.springboot.tutorial.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 首页
 * @author: wangyong
 * @date: 2019/3/25 1:02
 */

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HomeController {


	@Autowired
	private SpringTutorialProperties properties;


	/**
	 * 首页
	 */
	@GetMapping("/index")
	public Object index() {

		System.out.println("---" + properties.getAppName() + "---");
		User user = new User();
		user.setUserId("1");
		user.setName("张三");
		user.setBirth(new Date());

		return user;
	}


}
