package com.gong.sample.rabbit.listener;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MessageListener {

    public void receiveMessage(Map<String, String> message) {
//        System.out.println(message);
    }
}