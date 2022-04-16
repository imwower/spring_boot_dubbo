package com.example.service;

import com.example.User;

public interface HelloService {
    String hello(String name);

    User get(Integer id);
}
