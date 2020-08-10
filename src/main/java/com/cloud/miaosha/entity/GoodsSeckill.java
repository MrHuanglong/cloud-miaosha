package com.cloud.miaosha.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @Description TODO
 * @Author dashixiong
 * @Date 2020/8/9 11:34
 */
@Data
@TableName("sk_goods_seckill")
public class GoodsSeckill {

    @TableId
    private Long id;
    /**
     * 商品id
     */
    private Long goodsId;

    /**
     * 库存总量
     */
    private Integer stockCount;
    /**
     * 开始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date endDate;

    /**
     * 版本号
     */
    private int version;
}
