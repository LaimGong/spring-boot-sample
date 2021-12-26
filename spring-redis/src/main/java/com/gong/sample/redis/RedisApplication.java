package com.gong.sample.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.CountDownLatch;

@Slf4j
@SpringBootApplication
public class RedisApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(RedisApplication.class, args);
        log.info("RedisApp {} started...", ctx.getApplicationName());
        CountDownLatch cd = new CountDownLatch(1);
        try {
            cd.await();
        } catch (InterruptedException e) {
            log.error("RedisApp started error.", e);
        }
    }
}
