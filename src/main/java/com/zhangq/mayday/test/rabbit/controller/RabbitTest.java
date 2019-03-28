package com.zhangq.mayday.test.rabbit.controller;

import com.zhangq.mayday.model.domain.User;
import com.zhangq.mayday.test.controller.UserService;
import com.zhangq.mayday.test.rabbit.callback.CallBackSender;
import com.zhangq.mayday.test.rabbit.fanout.FanoutSender;
import com.zhangq.mayday.test.rabbit.hello.HelloSender1;
import com.zhangq.mayday.test.rabbit.hello.HelloSender2;
import com.zhangq.mayday.test.rabbit.topic.TopicSender;
import com.zhangq.mayday.test.rabbit.user.UserSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitTest {

    @Autowired
    private HelloSender1 helloSender1;
    @Autowired
    private HelloSender2 helloSender2;
    @Autowired
    private UserSender userSender;
    @Autowired
    private TopicSender topicSender;
    @Autowired
    private FanoutSender fanoutSender;
    @Autowired
    private CallBackSender callBackSender;

    @PostMapping("/hello")
    public void hello() {
        helloSender1.send();
    }

    /**
     * 单生产者-多消费者
     */
    @PostMapping("/oneToMany")
    public void oneToMany() {
        for (int i = 0; i < 10; i++) {
            helloSender1.send("hellomsg:" + i);
        }

    }

    /**
     * 多生产者-多消费者
     */
    @PostMapping("/manyToMany")
    public void manyToMany() {
        for (int i = 0; i < 10; i++) {
            helloSender1.send("hellomsg:" + i);
            helloSender2.send("hellomsg:" + i);
        }
    }

    /**
     * 实体类传输测试
     */
    @PostMapping("/userTest")
    public void userTest() {
        userSender.send();
    }

    /**
     * topic 测试
     */
    @PostMapping("/topicTest")
    public void topicTest() {
        topicSender.send();
    }

    /**
     * fanout exchange类型rabbitmq测试
     */
    @RequestMapping("/fanoutTest")
    public void fanoutTest() {
        fanoutSender.send();
    }
    @Autowired
    UserService userService;
    @RequestMapping(value = "/user/{id}")
    public User findByIdUser(@PathVariable("id") Integer id) {
        User us = userService.findUser(id);
        return us;
    }
    /**
     * 回调测试
     */
    @PostMapping("/callback")
    public void callbak() {
      //  callBackSender.send();
    }
}