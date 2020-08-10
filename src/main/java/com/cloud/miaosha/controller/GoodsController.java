package com.cloud.miaosha.controller;

import com.cloud.miaosha.entity.Goods;
import com.cloud.miaosha.service.GoodsService;
import com.cloud.miaosha.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Author dashixiong
 * @Date 2020/8/7 17:13
 */
@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/goodsList")
    public List<GoodsVo> goodsList() {
        return goodsService.listGoods();
    }

    @RequestMapping("/queryById")
    public Goods queryById(@RequestParam("id") long id) {
        return goodsService.queryById(id);
    }
}
