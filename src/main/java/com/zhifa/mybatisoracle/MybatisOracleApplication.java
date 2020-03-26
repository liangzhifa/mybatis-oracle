package com.zhifa.mybatisoracle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhifa.mybatisoracle.mapper")
public class MybatisOracleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisOracleApplication.class, args);
    }

}
