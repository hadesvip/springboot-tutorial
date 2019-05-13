package com.springboot.tutorial.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


/**
 * 首页
 * @author: wangyong
 * @date: 2019/5/6 22:03
 */
@RestController
class HomeController {

    @RequestMapping(value = ["/"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun index() = "Welcome, My Buddy!"


}