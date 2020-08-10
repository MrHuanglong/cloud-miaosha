package com.cloud.miaosha.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @Description TODO
 * @Author dashixiong
 * @Date 2020/8/9 15:36
 */
@Data
@TableName("sk_user")
public class User {

    @TableId
    private Long id;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 加盐
     */
    private String salt;

    /**
     *
     */
    private String head;

    /**
     * 注册时间
     */
    private Date registerDate;

    /**
     * 上一次登录时间
     */
    private Date lastLoginDate;

    /**
     * 登录总数
     */
    private Integer loginCount;
}
