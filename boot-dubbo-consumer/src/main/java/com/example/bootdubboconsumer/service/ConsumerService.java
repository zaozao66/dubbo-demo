package com.example.bootdubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Reference
    DemoService demoService;

    public String hello(String str) {
        return demoService.sayHello(str);
    }
}
