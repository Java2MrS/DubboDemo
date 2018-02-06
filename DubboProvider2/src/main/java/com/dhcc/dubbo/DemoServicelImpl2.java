package com.dhcc.dubbo;

import com.dhcc.dubbo.service.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 *  DubboDemo
 *  com.dhcc.dubbo
 *  @author:ShenTai
 *  @date: 2018/2/6  12:00
 */
public class DemoServicelImpl2 implements DemoService{
    public List<String> getPermissions(Long id) {
        List<String> list = new ArrayList<String>();
        list.add(String.format("服务2——%d", id - 1));
        list.add(String.format("服务2——%d", id));
        list.add(String.format("服务2——%d", id + 1));
        return list;
    }
}
