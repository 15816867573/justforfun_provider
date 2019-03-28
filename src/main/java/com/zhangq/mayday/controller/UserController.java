package com.zhangq.mayday.controller;

import com.zhangq.mayday.mapper.custom.UserMapperCustom;
import com.zhangq.mayday.mapper.generator.UserMapper;
import com.zhangq.mayday.model.domain.User;
import com.zhangq.mayday.model.domain.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserMapper userMapper;
    @RequestMapping(value = "/countByExample")
    @ResponseBody
    public long countByExample(@RequestBody UserExample example) {
        return userMapper.countByExample(example);
    }

    @RequestMapping(value = "/deleteByExample")
    @ResponseBody
    public int deleteByExample(@RequestBody UserExample example) {
        return userMapper.deleteByExample(example);
    }

    @RequestMapping(value = "/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(@RequestParam("userId") Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert(@RequestBody User example) {
        return userMapper.insert(example);
    }

    @RequestMapping(value = "/insertSelective")
    @ResponseBody
    public int insertSelective(@RequestBody User example) {
        return userMapper.insertSelective(example);
    }

    @RequestMapping(value = "/selectByExample")
    @ResponseBody
    public List<User> selectByExample(@RequestBody UserExample example) {
        return userMapper.selectByExample(example);
    }

    @RequestMapping(value = "/selectByPrimaryKey")
    @ResponseBody
    public User selectByPrimaryKey(@RequestParam("userId") Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @RequestMapping(value = "/updateByExampleSelective")
    @ResponseBody
    public int updateByExampleSelective(@RequestBody User record, @RequestBody UserExample example) {
        return userMapper.updateByExampleSelective(record, example);
    }

    @RequestMapping(value = "/updateByExample")
    @ResponseBody
    public int updateByExample(@RequestBody User record, @RequestBody UserExample example) {
        return userMapper.updateByExample(record, example);
    }

    @RequestMapping(value = "/updateByPrimaryKeySelective")
    @ResponseBody
    public int updateByPrimaryKeySelective(@RequestBody User example) {
        return userMapper.updateByPrimaryKeySelective(example);
    }

    @RequestMapping(value = "/updateByPrimaryKey")
    @ResponseBody
    public int updateByPrimaryKey(@RequestBody User example) {
        return userMapper.updateByPrimaryKey(example);
    }

    /**
     * UserMapperCustom
     */

    @RequestMapping(value = "/getByNameAndPwd")
    @ResponseBody
    public User getByNameAndPwd(@PathVariable String name,@PathVariable String pwd) {
        User user= userMapper.getByNameAndPwd( name, pwd);
        return user;
    }


    @RequestMapping(value = "/updateDatum")
    @ResponseBody
    public void updateDatum(@RequestBody(required = false) User user) {
        userMapper.updateDatum(user);
    }

    @RequestMapping(value = "/findUser")
    @ResponseBody
    public List<User> findUser() {
        List list= userMapper.findUser();
        return list;
    }

    @RequestMapping(value = "/findByUserIdAndUserPwd")
    @ResponseBody
    public User findByUserIdAndUserPwd(@PathVariable(value = "userId") Integer userId,
                                       @PathVariable(value = "formerlyPwd") String formerlyPwd) {
        return userMapper.findByUserIdAndUserPwd(userId, formerlyPwd);
    }
}
