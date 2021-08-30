package com.beichen.wiki.controller;


import com.beichen.wiki.domain.Test;
import com.beichen.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * restcontroller 一般返回字符串
 * Controller 一般返回页面,但是现在一般前后端分离，所以一般用不到这个注解
 */
@RestController
public class TestController {

    /**
     * 读取自定义配置项
     * @return
     */
    @Value("${test.hello}")
    private String testhello;

    @Resource
    private TestService testService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello world123";
    }

    @PostMapping("/hello")
    public String helloPost(String map){
        return "hello world ";
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
