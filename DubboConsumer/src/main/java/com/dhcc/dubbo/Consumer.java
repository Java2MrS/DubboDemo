package com.dhcc.dubbo;

import com.dhcc.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  DubboDemo
 *  com.dhcc.dubbo
 *  @author:ShenTai
 *  @date: 2018/2/6  11:19
 */
public class Consumer implements Runnable{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer1 start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println(demoService.getPermissions(1L));
    }

    public void run() {

    }
}
