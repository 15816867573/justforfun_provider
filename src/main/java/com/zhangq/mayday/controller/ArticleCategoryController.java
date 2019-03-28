package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.generator.ArticleCategoryMapper;
import com.zhangq.mayday.model.domain.ArticleCategory;
import com.zhangq.mayday.model.domain.ArticleCategoryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("articleCategory")
public class ArticleCategoryController {
    @Autowired
    private ArticleCategoryMapper articleCategoryMapper;

    @RequestMapping("/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody ArticleCategoryExample example) {
        return articleCategoryMapper.countByExample(example);
    }

    @RequestMapping("/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody ArticleCategoryExample example) {
        return articleCategoryMapper.deleteByExample(example);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody ArticleCategory articleCategory) {
        return articleCategoryMapper.insert(articleCategory);
    }

    @RequestMapping("/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody ArticleCategory articleCategory) {
        return articleCategoryMapper.insertSelective(articleCategory);
    }

    @RequestMapping("/selectByExample")
    @ResponseBody
    public List<ArticleCategory> selectByExample(@RequestBody ArticleCategoryExample example) {
        return articleCategoryMapper.selectByExample(example);
    }

    @RequestMapping("/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody ArticleCategory articleCategory, @Param("example") ArticleCategoryExample example) {
        return articleCategoryMapper.updateByExampleSelective(articleCategory, example);
    }

    @RequestMapping("/updateByExample")
    @ResponseBody
    public long updateByExample(@RequestBody ArticleCategory articleCategory, @RequestBody ArticleCategoryExample example) {
        return articleCategoryMapper.updateByExample(articleCategory, example);
    }
}
