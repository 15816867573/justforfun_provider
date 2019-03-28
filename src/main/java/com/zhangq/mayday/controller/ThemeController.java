package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.generator.ThemeMapper;
import com.zhangq.mayday.model.domain.Theme;
import com.zhangq.mayday.model.domain.ThemeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "theme")
public class ThemeController {
    @Autowired
    ThemeMapper themeMapper;

    @RequestMapping(value = "/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody ThemeExample example) {
        return themeMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody ThemeExample example) {
        return themeMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(@RequestParam("id") Integer id) {
        return themeMapper.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody Theme example) {
        return themeMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody Theme example) {
        return themeMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<Theme> selectByExample(@RequestBody ThemeExample example) {
        return themeMapper.selectByExample(example);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Theme selectByPrimaryKey(@RequestParam("id") Integer id) {
        return themeMapper.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody Theme record, @RequestBody ThemeExample example) {
        return themeMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public int updateByExample(@RequestBody Theme record, @RequestBody ThemeExample example) {
        return themeMapper.updateByExample(record, example);
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody Theme example) {
        return themeMapper.updateByPrimaryKeySelective(example);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    @ResponseBody
    public int updateByPrimaryKey(@RequestBody Theme example) {
        return themeMapper.updateByPrimaryKey(example);
    }
}
