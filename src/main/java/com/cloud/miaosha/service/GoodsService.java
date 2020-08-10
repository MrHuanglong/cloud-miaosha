package com.cloud.miaosha.service;

import com.cloud.miaosha.entity.Goods;
import com.cloud.miaosha.vo.GoodsVo;

import java.util.List;

/**
 * @Description TODO
 * @Author dashixiong
 * @Date 2020/8/9 15:47
 */
public interface GoodsService {

    Goods queryById(Long id);

    List<GoodsVo> listGoods();
}
