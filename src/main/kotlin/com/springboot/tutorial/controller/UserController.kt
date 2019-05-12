package com.springboot.tutorial.controller

import com.springboot.tutorial.domain.UserInfo
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/4/24 22:47
 */
@RequestMapping(value = ["/api"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
@RestController
class UserController {

    val id = AtomicLong()


    @GetMapping("/user")
    fun sayHello(@RequestParam(value = "name") name: String) =
            UserInfo(id.getAndIncrement(), "hello,$name")

}