package com.song01.springboot.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpService {

    @Bean
    public EmpService empService3(){

        System.out.println("这是啥玩意3Configuration下的bean配置 ？");
        return  new EmpService();
    }

    @Bean
    public EmpService empService2(){

        System.out.println("这是啥玩意2 ？");
        return  new EmpService();
    }


}
