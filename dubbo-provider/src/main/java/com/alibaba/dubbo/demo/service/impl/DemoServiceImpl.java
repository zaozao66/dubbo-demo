package com.alibaba.dubbo.demo.service.impl;

import com.alibaba.dubbo.demo.service.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {


    public String sayHello(String name) {
        return "hello" + name;
    }
}
