package com.gong.sample.rabbit.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println(message);
    }
}
