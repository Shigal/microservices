package com.shigal.rentacar.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String greeting(){
        return "Hello, there";
    }

    @RequestMapping(value = "/hi", method = RequestMethod.POST)
    public String greeting1(){
        return "Hello, we are in POST";
    }
}
