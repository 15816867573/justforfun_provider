package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.generator.ArticleTagMapper;
import com.zhangq.mayday.model.domain.Article;
import com.zhangq.mayday.model.domain.ArticleTag;
import com.zhangq.mayday.model.domain.ArticleTagExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "articleTag")
public class ArticleTagController {
    @Autowired
    ArticleTagMapper articleTagMapper;

    @RequestMapping(value = "/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody ArticleTagExample example) {
        return articleTagMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody ArticleTagExample example) {
        return articleTagMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody ArticleTag example) {
        return articleTagMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody ArticleTag example) {
        return articleTagMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<ArticleTag> selectByExample(@RequestBody ArticleTagExample example) {
        return articleTagMapper.selectByExample(example);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody ArticleTag record, @RequestBody ArticleTagExample example) {
        return articleTagMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public int updateByExample(@RequestBody ArticleTag record, @RequestBody ArticleTagExample example) {
        return articleTagMapper.updateByExample(record, example);
    }
}
