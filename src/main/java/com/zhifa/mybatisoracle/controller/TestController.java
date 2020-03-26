package com.zhifa.mybatisoracle.controller;

import com.zhifa.mybatisoracle.domain.Lzf;
import com.zhifa.mybatisoracle.mapper.LzfMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private LzfMapper lzfMapper;

    @RequestMapping("/")
    public Object f(){
        Lzf lzf = new Lzf();
        StringBuffer sb = new StringBuffer("233");

        lzf.setArticle(sb.toString());
        lzf.setBirthDay(new Date());
        lzf.setName("lzf");
        lzfMapper.insert(lzf);

        return lzf;
    }
}
