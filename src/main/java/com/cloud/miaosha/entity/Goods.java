package com.cloud.miaosha.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author dashixiong
 * @Date 2020/8/9 11:25
 */
@Data
@TableName("sk_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId
    private Long id;
    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品标题
     */
    private String goodsTitle;

    /**
     * 商品地址
     */
    private String goodsImg;

    /**
     * 商品详情
     */
    private String goodsDetail;

    /**
     * 价格
     */
    private Double goodsPrice;

    /**
     * 库存
     */
    private Integer goodsStock;

}
