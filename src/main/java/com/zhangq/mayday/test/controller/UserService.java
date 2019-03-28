package com.zhangq.mayday.test.controller;

import com.zhangq.mayday.mapper.generator.UserMapper;
import com.zhangq.mayday.model.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
@Component
public class UserService implements UserServiceImpl{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }
}
