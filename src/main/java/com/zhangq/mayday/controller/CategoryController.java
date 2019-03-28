package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.generator.CategoryMapper;
import com.zhangq.mayday.model.domain.Category;
import com.zhangq.mayday.model.domain.CategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "category")
public class CategoryController {
    @Autowired
    CategoryMapper categoryMapper;

    @RequestMapping(value = "/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody CategoryExample example) {
        return categoryMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody CategoryExample example) {
        return categoryMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(@RequestParam("categoryId") Integer categoryId) {
        return categoryMapper.deleteByPrimaryKey(categoryId);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody Category example) {
        return categoryMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody Category example) {
        return categoryMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<Category> selectByExample(@RequestBody CategoryExample example) {
        return categoryMapper.selectByExample(example);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Category selectByPrimaryKey(@RequestParam("categoryId") Integer categoryId) {
        return categoryMapper.selectByPrimaryKey(categoryId);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody Category record, @RequestBody CategoryExample example) {
        return categoryMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public int updateByExample(@RequestBody Category record, @RequestBody CategoryExample example) {
        return categoryMapper.updateByExample(record, example);
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody Category example) {
        return categoryMapper.updateByPrimaryKeySelective(example);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    @ResponseBody
    public int updateByPrimaryKey(@RequestBody Category example) {
        return categoryMapper.updateByPrimaryKey(example);
    }
}
