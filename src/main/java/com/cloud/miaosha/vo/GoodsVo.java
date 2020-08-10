package com.cloud.miaosha.vo;

import com.cloud.miaosha.entity.Goods;
import lombok.Data;

import java.util.Date;

/**
 * @Description TODO
 * @Author dashixiong
 * @Date 2020/8/10 16:15
 */
@Data
public class GoodsVo extends Goods {
    private Double seckillPrice;
    private Integer stockCount;
    private Date startDate;
    private Date endDate;
    private Integer version;
}
