package com.springboot.tutorial

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


/**
 * 应用入口
 * @author: wangyong
 * @date: 2019/4/25 21:13
 */

@SpringBootApplication
class ApplicationByKotlin

fun main(args: Array<String>) {
    SpringApplication.run(ApplicationByKotlin::class.java, *args)
}