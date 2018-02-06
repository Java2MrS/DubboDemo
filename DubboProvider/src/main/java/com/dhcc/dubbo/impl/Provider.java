package com.dhcc.dubbo.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 *  DubboDemo
 *  com.dhcc.dubbo.impl
 *  @author:ShenTai
 *  @date: 2018/2/6  11:03
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务1已经启动...");
        System.in.read();
    }
}
