package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.generator.MenuMapper;
import com.zhangq.mayday.model.domain.Menu;
import com.zhangq.mayday.model.domain.MenuExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "menu")
public class MenuController {
    @Autowired
    MenuMapper menuMapper;

    @RequestMapping(value = "/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody MenuExample example) {
        return menuMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody MenuExample example) {
        return menuMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(@RequestParam("menuId") Integer menuId) {
        return menuMapper.deleteByPrimaryKey(menuId);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody Menu example) {
        return menuMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody Menu example) {
        return menuMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<Menu> selectByExample(@RequestBody MenuExample example) {
        return menuMapper.selectByExample(example);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public Menu selectByPrimaryKey(@RequestParam("linkId") Integer linkId) {
        return menuMapper.selectByPrimaryKey(linkId);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody Menu record, @RequestBody MenuExample example) {
        return menuMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public int updateByExample(@RequestBody Menu record, @RequestBody MenuExample example) {
        return menuMapper.updateByExample(record, example);
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody Menu example) {
        return menuMapper.updateByPrimaryKeySelective(example);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    @ResponseBody
    public int updateByPrimaryKey(@RequestBody Menu example) {
        return menuMapper.updateByPrimaryKey(example);
    }
}
