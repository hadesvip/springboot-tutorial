package com.springboot.tutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


/**
 * 程序入口
 * @author: wangyong
 * @date: 2019/4/24 22:41
 */
@SpringBootApplication
class Application
fun main(args: Array<String>) {
    runApplication<Application>(*args)
}