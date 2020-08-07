package com.cloud.miaosha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Description 启动类
 * @Author dashixiong
 * @Date 2020/8/6 22:57
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MiaoShaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiaoShaApplication.class, args);
    }
}
