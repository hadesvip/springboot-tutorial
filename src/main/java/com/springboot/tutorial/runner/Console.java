package com.springboot.tutorial.runner;

import java.lang.reflect.Method;

/**
 * 直接运行
 * @author: wangyong
 * @date: 2019/3/31 18:43
 */
public class Console {
	public static void main(String[] args) throws Exception {
		Method mainMethod = Main.class.getDeclaredMethod("main", String[].class);
		mainMethod.invoke(null, new Object[]{args});
	}
}
