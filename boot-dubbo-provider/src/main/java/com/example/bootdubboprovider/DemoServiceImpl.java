package com.example.bootdubboprovider;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.demo.service.DemoService;
import org.springframework.stereotype.Component;

@Service
@Component
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello" + name;
    }
}
