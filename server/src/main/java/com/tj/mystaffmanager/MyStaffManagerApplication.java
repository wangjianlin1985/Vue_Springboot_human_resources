package com.tj.mystaffmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tj.mystaffmanager.mapper")
public class MyStaffManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyStaffManagerApplication.class, args);
    }

}
