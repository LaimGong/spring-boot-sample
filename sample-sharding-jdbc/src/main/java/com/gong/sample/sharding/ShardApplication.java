package com.gong.sample.sharding;

import com.gong.sample.sharding.dto.ShardDto;
import com.gong.sample.sharding.service.ShardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

@Slf4j
@SpringBootApplication
public class ShardApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ShardApplication.class, args);
        log.info("ShardApplication {} started...", ctx.getApplicationName());
        CountDownLatch cd = new CountDownLatch(1);
        try {
            cd.await();
        } catch (InterruptedException e) {
            log.error("ShardApplication error", e);
        }
    }

}
