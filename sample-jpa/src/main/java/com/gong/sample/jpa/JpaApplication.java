package com.gong.sample.jpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(JpaApplication.class, args);
    }

}
