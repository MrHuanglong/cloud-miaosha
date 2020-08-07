package com.cloud.miaosha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author dashixiong
 * @Date 2020/8/7 17:13
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "hello world!";
    }
}
