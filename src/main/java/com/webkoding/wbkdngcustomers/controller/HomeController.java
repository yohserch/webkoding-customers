package com.webkoding.wbkdngcustomers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/home")
    public String welcome() {
        log.info("This is a test");
        return "Hi";
    }
    
}
