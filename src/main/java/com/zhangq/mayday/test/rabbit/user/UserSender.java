package com.zhangq.mayday.test.rabbit.user;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(){
        User user=new User();
        user.setName("张三");
        user.setPhone("15816867573");
        System.out.println("user send : " + user.getName()+"/"+user.getPhone());
        this.rabbitTemplate.convertAndSend("userQueue",user);
    }
}
