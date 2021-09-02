package com.beichen.wiki.service;

import com.beichen.wiki.domain.Ebook;
import com.beichen.wiki.domain.EbookExample;
import com.beichen.wiki.mapper.EbookMapper;
import com.beichen.wiki.req.EbookReq;
import com.beichen.wiki.resp.EbookResp;
import com.beichen.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper EbookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = EbookMapper.selectByExample(ebookExample);

        /**
         * 我们要将从数据库中查的List<Ebook>转换成返回的消息格式EbookResp，所以要循环遍历上面的ebookList变成EbookResp类
         * 使用java自带api接口进行拷贝
         *
         List<EbookResp> ebookRespList = new ArrayList<>();
         for (Ebook ebook : ebookList) {
         EbookResp ebookResp = new EbookResp();
         BeanUtils.copyProperties(ebook,ebookResp);
         ebookRespList.add(ebookResp);
         }
         */

//        使用自己定义的工具类进行拷贝
        List<EbookResp> list = CopyUtil.copyList(ebookList,EbookResp.class);
        return list;
    };
}


