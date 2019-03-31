package com.springboot.tutorial.domain;

import java.util.Date;

/**
 * 用户信息
 * @author: wangyong
 * @date: 2019/3/25 1:06
 */
public class User {

	private String userId;


	private String name;


	private Date birth;


	public String getUserId() {
		return userId;
	}

	public User setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public Date getBirth() {
		return birth;
	}

	public User setBirth(Date birth) {
		this.birth = birth;
		return this;
	}
}
