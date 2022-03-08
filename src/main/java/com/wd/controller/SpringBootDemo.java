package com.wd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootDemo {
    @RequestMapping("/test")
    public String test() {
        return "Hello SpringBoot!";
    }
}