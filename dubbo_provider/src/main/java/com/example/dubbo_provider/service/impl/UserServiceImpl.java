package com.example.dubbo_provider.service.impl;

import com.example.User;
import com.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@Slf4j
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(Integer id) {
        return User.builder()
                .id(id)
                .name("user name: " + id)
                .build();
    }
}
