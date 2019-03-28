package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.generator.OptionsMapper;
import com.zhangq.mayday.model.domain.Options;
import com.zhangq.mayday.model.domain.OptionsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "options")
public class OptionsController {
    @Autowired
    OptionsMapper optionsMapper;

    @RequestMapping(value = "/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody OptionsExample example) {
        return optionsMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody OptionsExample example) {
        return optionsMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(@RequestParam("optionName") String optionName) {
        return optionsMapper.deleteByPrimaryKey(optionName);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody Options example) {
        return optionsMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody Options example) {
        return optionsMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<Options> selectByExample(@RequestBody OptionsExample example) {
        return optionsMapper.selectByExample(example);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Options selectByPrimaryKey(@RequestParam("optionName") String optionName) {
        return optionsMapper.selectByPrimaryKey(optionName);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody Options record, @RequestBody OptionsExample example) {
        return optionsMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public int updateByExample(@RequestBody Options record, @RequestBody OptionsExample example) {
        return optionsMapper.updateByExample(record, example);
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody Options example) {
        return optionsMapper.updateByPrimaryKeySelective(example);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    @ResponseBody
    public int updateByPrimaryKey(@RequestBody Options example) {
        return optionsMapper.updateByPrimaryKey(example);
    }
}
