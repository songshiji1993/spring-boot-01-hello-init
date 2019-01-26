package com.song01.springboot;

import com.song01.springboot.bean.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;//注意包名
import org.slf4j.LoggerFactory;
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
        System.getProperty("user.1 dir");
        System.out.println(System.getProperty("user.1 dir"));

    }
    @Test//测试配置文件
    public void testXml1(){
        System.out.println("empService: " + context.getBean("empService"));

    }
    @Test//测试配置文件
    public void testlog1(){
        System.out.println("empService: " + context.getBean("empService"));
        Logger logger =  LoggerFactory.getLogger(getClass());//注意包名
//1. 以下日志级别，由低到高：trace < debug < info < warn < error
//2. Spring Boot默认设定的是 info 级别日志，(日志默认级别也称为root级别)。
// 可修改默认级别日志：logging.level.level=级别名
//3. 可以进行调整日志级别，设定某个级别后，就只打印设定的这个级别及后面高级别的日志信息
// 没有指定级别的就用SpringBoot默认规定的级别：root级别
//4. 可修改指定包的日志级别：
// 指定某个包下面的所有日志级别：logging.level.包名=级别名
        logger.trace("这是 trace 日志信息！");
        logger.debug("这是 debug 日志信息！");
        logger.info("这是 info 日志信息！");
        logger.warn("这是 warn 日志信息！");
        logger.error("这是 error 日志信息！ logging.level.root = error");
    }



}

