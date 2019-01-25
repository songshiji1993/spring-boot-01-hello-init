package com.song01.springboot;

import com.song01.springboot.bean.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01HelloInitApplicationTests {
        @Autowired
        ApplicationContext context;
        @Autowired
        Emp emp;
    @Test
    public  void contextLoads(){

        System.out.println(emp);

    }
    @Test
    public void testXml1(){
        System.out.println("empService: " + context.getBean("empService"));

    }


}

