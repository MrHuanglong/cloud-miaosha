package com.cloud.miaosha.controller;

import com.cloud.miaosha.entity.Goods;
import com.cloud.miaosha.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author dashixiong
 * @Date 2020/8/7 17:13
 */
@RestController
public class TestController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/test")
    public String test() {
        return "hello world!";
    }

    @RequestMapping("/queryById")
    public Goods queryById(@RequestParam("id") long id) {
        return goodsService.queryById(id);
    }
}
