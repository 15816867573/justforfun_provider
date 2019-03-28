package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.generator.LinkMapper;
import com.zhangq.mayday.model.domain.Link;
import com.zhangq.mayday.model.domain.LinkExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "link")
public class LinkController {
    @Autowired
    LinkMapper linkMapper;

    @RequestMapping(value = "/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody LinkExample example) {
        return linkMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody LinkExample example) {
        return linkMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(@RequestParam("linkId") Integer linkId) {
        return linkMapper.deleteByPrimaryKey(linkId);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody Link example) {
        return linkMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody Link example) {
        return linkMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<Link> selectByExample(@RequestBody LinkExample example) {
        return linkMapper.selectByExample(example);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Link selectByPrimaryKey(@RequestParam Integer linkId) {
        return linkMapper.selectByPrimaryKey(linkId);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody Link record, @RequestBody LinkExample example) {
        return linkMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public int updateByExample(@RequestBody Link record, @RequestBody LinkExample example) {
        return linkMapper.updateByExample(record, example);
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody Link example) {
        return linkMapper.updateByPrimaryKeySelective(example);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    @ResponseBody
    public int updateByPrimaryKey(@RequestBody Link example) {
        return linkMapper.updateByPrimaryKey(example);
    }
}
