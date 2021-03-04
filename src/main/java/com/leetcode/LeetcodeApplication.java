package com.leetcode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//扫描Mapper
@MapperScan("com.leetcode.mapper")
//扫描注册过滤器
@ServletComponentScan("com.leetcode.filter")
//开启事务
@EnableTransactionManagement(proxyTargetClass = true)
@SpringBootApplication
public class LeetcodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeetcodeApplication.class, args);
    }

}


