package com.example.ServiceDiscoveryClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

    @Value("${app1.name1: defaultName}")
    private String appName;

    @GetMapping(value = "/getMessage")
    public String getMessage(){
        return "hello from client one";
    }

    @GetMapping(value = "/getAppName")
    public String getAppName(){
        return appName;
    }
}
