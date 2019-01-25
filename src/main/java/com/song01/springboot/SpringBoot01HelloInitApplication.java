package com.song01.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@ImportResource(locations  = {"classpath:spring01.xml"}) //使用xml配置
@SpringBootApplication
public class   SpringBoot01HelloInitApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBoot01HelloInitApplication.class, args);
    }







}

