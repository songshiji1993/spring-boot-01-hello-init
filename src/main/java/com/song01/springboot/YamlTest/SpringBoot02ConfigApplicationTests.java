package com.song01.springboot.YamlTest;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {
   @Autowired
    Emp emp;
    @Test
    public  void contextLoads(){

        System.out.println(emp);

    }

}
