package com.example.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - Constructor";
    }
}
