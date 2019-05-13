package com.springboot.tutorial

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder


/**
 * 应用入口
 * @author: wangyong
 * @date: 2019/4/25 21:13
 */

@SpringBootApplication
class ApplicationByKotlin

fun main(args: Array<String>) {
//    SpringApplication.run(ApplicationByKotlin::class.java, *args)

    //builder模式
    SpringApplicationBuilder(ApplicationByKotlin::class.java)
            .properties("server.port=0")
            .run(*args)


//    val springApplication = SpringApplication(ApplicationByKotlin::class.java)
//    val properties = mapOf<String, Any>("server.port" to 0)
//    springApplication.setDefaultProperties(properties)
//    springApplication.run(*args)





}

