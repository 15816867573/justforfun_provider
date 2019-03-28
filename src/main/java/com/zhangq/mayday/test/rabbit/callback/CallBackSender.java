package com.zhangq.mayday.test.rabbit.callback;

import org.springframework.stereotype.Component;

//implements  RabbitTemplate.ConfirmCallback
@Component
public class CallBackSender {
 /*   @Autowired
    private RabbitTemplate rabbitTemplatenew;
    public void send() {

        rabbitTemplatenew.setConfirmCallback(this);
        String msg="callbackSender : i am callback sender";
        System.out.println(msg );
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        System.out.println("callbackSender UUID: " + correlationData.getId());
        this.rabbitTemplatenew.convertAndSend("exchange", "topic.messages", msg, correlationData);
    }
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        // TODO Auto-generated method stub
        System.out.println("callbakck confirm: " + correlationData.getId());
    }*/
}