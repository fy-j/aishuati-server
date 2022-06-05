package com.example.aishuatiserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.example.aishuatiserver.mapper")
@EnableAspectJAutoProxy
public class AishuatiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AishuatiServerApplication.class, args);
    }

}
