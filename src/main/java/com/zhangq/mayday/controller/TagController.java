package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.generator.TagMapper;
import com.zhangq.mayday.model.domain.Tag;
import com.zhangq.mayday.model.domain.TagExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "tag")
public class TagController {
    @Autowired
    TagMapper tagMapper;

    @RequestMapping(value = "/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody TagExample example) {
        return tagMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody TagExample example) {
        return tagMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(@RequestParam("tagId") Integer tagId) {
        return tagMapper.deleteByPrimaryKey(tagId);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody Tag example) {
        return tagMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody Tag example) {
        return tagMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<Tag> selectByExample(@RequestBody TagExample example) {
        return tagMapper.selectByExample(example);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Tag selectByPrimaryKey(@RequestParam("tagId") Integer tagId) {
        return tagMapper.selectByPrimaryKey(tagId);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody Tag record, @RequestBody TagExample example) {
        return tagMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public int updateByExample(@RequestBody Tag record, @RequestBody TagExample example) {
        return tagMapper.updateByExample(record, example);
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody Tag example) {
        return tagMapper.updateByPrimaryKeySelective(example);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    @ResponseBody
    public int updateByPrimaryKey(@RequestBody Tag example) {
        return tagMapper.updateByPrimaryKey(example);
    }
}
