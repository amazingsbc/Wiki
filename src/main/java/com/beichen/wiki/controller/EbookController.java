package com.beichen.wiki.controller;


import com.beichen.wiki.req.EbookReq;
import com.beichen.wiki.resp.CommonResp;
import com.beichen.wiki.resp.EbookResp;
import com.beichen.wiki.service.EbookService;
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
@RequestMapping("/ebook")
public class EbookController {

    /**
     * 读取自定义配置项
     * @return
     */

    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
//        resp.setMessage("ebookmessage");
        return resp;
    }
}
