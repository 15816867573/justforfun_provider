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
    public long countByExample(@RequestBody(required = false) LinkExample example) {
        return linkMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody(required = false) LinkExample example) {
        return linkMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(@RequestParam(value = "linkId",required = false) Integer linkId) {
        return linkMapper.deleteByPrimaryKey(linkId);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody(required = false) Link example) {
        return linkMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody(required = false) Link example) {
        return linkMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<Link> selectByExample(@RequestBody(required = false) LinkExample example) {
        return linkMapper.selectByExample(example);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Link selectByPrimaryKey(@RequestParam(value = "linkId",required = false) Integer linkId) {
        return linkMapper.selectByPrimaryKey(linkId);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestParam(value = "record",required = false) Link record, @RequestBody(required = false) LinkExample example) {
        return linkMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public int updateByExample(@RequestBody(required = false) Link record, @RequestBody(required = false) LinkExample example) {
        return linkMapper.updateByExample(record, example);
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody(required = false) Link example) {
        return linkMapper.updateByPrimaryKeySelective(example);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    @ResponseBody
    public int updateByPrimaryKey(@RequestBody(required = false) Link example) {
        return linkMapper.updateByPrimaryKey(example);
    }
}
