package com.dhcc.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 *  DubboDemo
 *  com.dhcc.dubbo
 *  @author:ShenTai
 *  @date: 2018/2/6  11:57
 */
public class Provider2 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider2.xml");
        System.out.println("context = " + context);
        context.start();
        System.out.println("服务2已经启动...");
        System.in.read();
    }

}
