package com.alibaba.dubbo.demo.service.impl;

import com.alibaba.dubbo.demo.service.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {
    public List<String> getUserList(String name) {
        List<String> result = new ArrayList<String>();
        result.add("用户id为1，name:" + name);
        result.add("用户id为5，name:" + name);
        result.add("用户id为11，name:" + name);

        return result;
    }
}
