package com.zhangq.mayday.test.rabbit.user;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener
public class UserReceiver {
    @RabbitHandler
    public void precess(User user){
        System.out.println("user receive  : " + user.getName()+"/"+user.getPhone());
    }
}
