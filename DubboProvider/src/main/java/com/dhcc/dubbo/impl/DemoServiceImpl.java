package com.dhcc.dubbo.impl;

import com.dhcc.dubbo.service.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 *  DubboDemo
 *  com.dhcc.dubbo
 *  @author:ShenTai
 *  @date: 2018/2/6  10:18
 */
public class DemoServiceImpl implements DemoService {
    public List<String> getPermissions(Long id) {
        List<String> list = new ArrayList<String>();
        list.add(String.format("服务1——%d", id - 1));
        list.add(String.format("服务1——%d", id));
        list.add(String.format("服务1——%d", id + 1));
        return list;
    }
}
