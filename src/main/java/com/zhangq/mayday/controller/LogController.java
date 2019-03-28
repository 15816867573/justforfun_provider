package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.generator.LogMapper;
import com.zhangq.mayday.model.domain.Log;
import com.zhangq.mayday.model.domain.LogExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "log")
public class LogController {
    @Autowired
    LogMapper logMapper;

    @RequestMapping(value = "/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody LogExample example) {
        return logMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody LogExample example) {
        return logMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(@RequestParam("logId") Integer logId) {
        return logMapper.deleteByPrimaryKey(logId);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody Log example) {
        return logMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody Log example) {
        return logMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<Log> selectByExample(@RequestBody LogExample example) {
        return logMapper.selectByExample(example);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Log selectByPrimaryKey(@RequestParam("logId") Integer logId) {
        return logMapper.selectByPrimaryKey(logId);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody Log record, @RequestBody LogExample example) {
        return logMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public int updateByExample(@RequestBody Log record, @RequestBody LogExample example) {
        return logMapper.updateByExample(record, example);
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody Log example) {
        return logMapper.updateByPrimaryKeySelective(example);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    @ResponseBody
    public int updateByPrimaryKey(@RequestBody Log example) {
        return logMapper.updateByPrimaryKey(example);
    }
}
