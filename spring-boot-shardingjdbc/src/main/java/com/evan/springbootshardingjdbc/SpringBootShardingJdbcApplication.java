package com.evan.springbootshardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.macky.springbootshardingjdbc.mapper")
@SpringBootApplication
public class SpringBootShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootShardingJdbcApplication.class, args);
    }

}
