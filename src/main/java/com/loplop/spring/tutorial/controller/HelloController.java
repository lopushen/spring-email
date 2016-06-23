package com.loplop.spring.tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by i.lopushen on 22/06/2016.
 */
@RestController
public class HelloController {

    @Value("${app.name}")
    private String appName;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello, " + appName;
    }
}
