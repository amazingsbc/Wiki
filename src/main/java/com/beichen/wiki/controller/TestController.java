package com.beichen.wiki.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * restcontroller 一般返回字符串
 * Controller 一般返回页面,但是现在一般前后端分离，所以一般用不到这个注解
 */
@RestController
public class TestController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }

    @PostMapping("/hello")
    public String helloPost(String map){
        return "hello world " + map;
    }
}
