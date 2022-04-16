package com.example.dubbo_comsumer.controller;

import com.example.User;
import com.example.service.HelloService;
import com.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @DubboReference
    private HelloService helloService;
    @DubboReference
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        String abc = helloService.hello("abc");
        return abc;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) {
        User user = userService.getUser(id);
        return user;
    }
}
