package com.gong.sample.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class IndexController {

    @GetMapping("/echo")
    public Mono<String> echo() {
        return Mono.just("mono echo");
    }

}
