package com.zhifa.mybatisoracle.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhifa.mybatisoracle.domain.Lzf;
import com.zhifa.mybatisoracle.mapper.LzfMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

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

    @GetMapping("/list")
    public PageInfo<Lzf> getList(){
        PageHelper.startPage(1, 10);
        List<Lzf> lzfList = lzfMapper.selectList(null);
        PageInfo<Lzf> lzfPageInfo = new PageInfo<>(lzfList);
        return lzfPageInfo;
    }
}
