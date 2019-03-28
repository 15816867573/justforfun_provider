package com.zhangq.mayday.test.controller;

import com.zhangq.mayday.model.domain.User;

public interface UserServiceImpl  {
    User findUser( Integer id);
    int insert(User user);
}
