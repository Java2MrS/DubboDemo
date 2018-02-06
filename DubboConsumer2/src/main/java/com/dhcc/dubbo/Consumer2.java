package com.dhcc.dubbo;

import com.dhcc.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  DubboDemo
 *  com.dhcc.dubbo
 *  @author:ShenTai
 *  @date: 2018/2/6  14:51
 */
public class Consumer2 implements Runnable{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer2.xml");
        context.start();
        System.out.println("consumer2 start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println(new Thread(new Consumer2("线程1")).start());
    }

    public void run() {

    }
}
