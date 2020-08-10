package com.cloud.miaosha.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description TODO
 * @Author dashixiong
 * @Date 2020/8/9 11:36
 */
@Data
@TableName("sk_order")
public class Order {
    @TableId
    private Long id;
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 订单id
     */
    private Long  orderId;

    /**
     * 商品id
     */
    private Long goodsId;
}
