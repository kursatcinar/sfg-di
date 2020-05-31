package com.example.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - Property";
    }
}
