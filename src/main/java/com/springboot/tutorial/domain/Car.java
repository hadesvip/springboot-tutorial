package com.springboot.tutorial.domain;

import java.io.Serializable;

/**
 * 汽车
 * @author: wangyong
 * @date: 2019/6/16 15:30
 */
public class Car implements Serializable {


	private String id;

	private String name;


	public Car() {
	}

	public Car(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public Car setId(String id) {
		this.id = id;
		return this;
	}


	public String getName() {
		return name;
	}

	public Car setName(String name) {
		this.name = name;
		return this;
	}
}
