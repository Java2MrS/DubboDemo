package com.dhcc.dubbo.service;

import java.util.List;

/**
 *  DubboDemo
 *  com.dhcc.dubbo
 *  @author:ShenTai
 *  @date: 2018/2/6  10:15
 */
public interface DemoService {
    //测试提交
    List<String> getPermissions(Long id);
}
