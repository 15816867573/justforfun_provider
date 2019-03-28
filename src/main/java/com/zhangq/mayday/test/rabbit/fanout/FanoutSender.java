package com.zhangq.mayday.test.rabbit.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate rabbittemplate;
    public void send(){
        String msgString="fanoutSender :hello i am zhangsan";
        System.out.println(msgString);
        this.rabbittemplate.convertAndSend("fanoutExchange","abcd.ee",msgString);
    }
}
