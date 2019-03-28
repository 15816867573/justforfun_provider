package com.zhangq.mayday.test.controller;

import com.zhangq.mayday.mapper.generator.UserMapper;
import com.zhangq.mayday.model.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController//可以直接返回json等字符串，不能解析jsp,html等，@Controller可以解析jsp,html等页面，若返回json需要@ResponseBody
@RequestMapping("provider")
public class TestController {
    @Autowired
    UserService userService;
    @Autowired
    UserMapper userMapper;
    @RequestMapping(value = "/user/{id}")
    public User findByIdUser(@PathVariable("id") Integer id) {
        User us = userService.findUser(id);
        return us;
    }
    @RequestMapping(value = "/insert")
    @ResponseBody
    public int insert( @RequestBody User user){
        return userMapper.insert(user);
    }
}
