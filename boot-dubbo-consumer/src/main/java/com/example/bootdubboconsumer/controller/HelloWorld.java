package com.example.bootdubboconsumer.controller;

import com.example.bootdubboconsumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/hello")
    public String helloWorld(@RequestParam("word") String word) {
        return consumerService.hello(word);
    }
}
