package com.example.sfgdi.controller;

import com.example.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedService")
    @Autowired
    public GreetingService greetingService;

    public String getHello() {
        return greetingService.sayHello();
    }
}
