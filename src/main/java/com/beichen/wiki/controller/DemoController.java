package com.beichen.wiki.controller;


import com.beichen.wiki.domain.Demo;
import com.beichen.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * restcontroller 一般返回字符串
 * Controller 一般返回页面,但是现在一般前后端分离，所以一般用不到这个注解
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    /**
     * 读取自定义配置项
     * @return
     */

    @Resource
    private DemoService demoService;


    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
