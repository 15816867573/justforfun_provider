package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.generator.ArticleMapper;
import com.zhangq.mayday.model.domain.Article;
import com.zhangq.mayday.model.domain.ArticleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    ArticleMapper articleMapper;

    @RequestMapping(value = "/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody ArticleExample example) {
        return articleMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody ArticleExample example) {
        return articleMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(Integer id) {
        return articleMapper.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody Article example) {
        return articleMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody Article example) {
        return articleMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<Article> selectByExample(@RequestBody ArticleExample example) {
        return articleMapper.selectByExample(example);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Article selectByPrimaryKey(@RequestParam("id") Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody Article record, @RequestBody ArticleExample example) {
        return articleMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public long updateByExample(@RequestBody Article record, @RequestBody ArticleExample example) {
        return articleMapper.updateByExample(record, example);
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public long updateByPrimaryKeySelective(@RequestBody Article example) {
        return articleMapper.updateByPrimaryKeySelective(example);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    @ResponseBody
    public long updateByPrimaryKey(@RequestBody Article example) {
        return articleMapper.updateByPrimaryKey(example);
    }
}
