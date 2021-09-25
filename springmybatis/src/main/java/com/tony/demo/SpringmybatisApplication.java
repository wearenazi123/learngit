package com.tony.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(value = "com.myself.mybatis")
@MapperScan("com.myself.mybatis.mapper")
@SpringBootApplication
public class SpringmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmybatisApplication.class, args);
    }

}
