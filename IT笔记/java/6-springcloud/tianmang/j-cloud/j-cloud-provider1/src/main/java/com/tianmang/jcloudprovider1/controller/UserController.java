package com.tianmang.jcloudprovider1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/sayHello")
    public String sayhello(){
        return "我说应用1，sayHello";
    }
    @RequestMapping("/sayHi")
    public String sayHi(){
        return "我说应用1，sayHi";
    }
    @RequestMapping("/sayHaha")
    public String sayHaha(){
        return "我说应用1，sayHaha";
    }








}
