package com.gong.sample.rabbit.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static com.gong.sample.rabbit.config.RabbitConfig.MESSAGE_QUEUE;

@Component
public class RabbitMessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String id) {
        Map<String, String> actionMap = new HashMap<>();
        actionMap.put("id", id);
        try {
            rabbitTemplate.convertAndSend(MESSAGE_QUEUE, actionMap);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
