package com.atguigu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @title
 * @ClassName Application
 * @Date 2022/10/20 10:34
 */
@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
