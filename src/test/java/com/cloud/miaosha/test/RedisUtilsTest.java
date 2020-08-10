package com.cloud.miaosha.test;

import com.cloud.miaosha.common.utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description TODO
 * @Author dashixiong
 * @Date 2020/8/10 16:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisUtilsTest {

    @Autowired
    RedisUtils redisUtils;

    @Test
    public void test() {
        System.out.println(redisUtils.get("name"));
    }
}
