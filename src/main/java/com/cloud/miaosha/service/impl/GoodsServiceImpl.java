package com.cloud.miaosha.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.miaosha.dao.GoodsMapper;
import com.cloud.miaosha.entity.Goods;
import com.cloud.miaosha.service.GoodsService;
import com.cloud.miaosha.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author dashixiong
 * @Date 2020/8/9 15:47
 */
@Service("goodsService")
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public Goods queryById(Long id) {
        return this.getById(id);
    }

    @Override
    public List<GoodsVo> listGoods() {
        return null;
    }
}
