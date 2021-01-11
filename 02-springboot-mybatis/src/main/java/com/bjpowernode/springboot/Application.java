package com.bjpowernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 *  给每个mapper接口注解太麻烦，所以直接采用MapperScan注解一次性的扫描mapper包以及子包
 * */
@MapperScan(basePackages = "com.bjpowernode.springboot.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
