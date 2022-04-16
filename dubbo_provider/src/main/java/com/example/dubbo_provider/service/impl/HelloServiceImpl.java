package com.example.dubbo_provider.service.impl;

import com.example.User;
import com.example.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@Slf4j
@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello, " + name;
    }

    @Override
    public User get(Integer id) {
        return User.builder()
                .id(id)
                .name("name: " + id)
                .build();
    }
}
