package com.main.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "M3-GREET-SERVICE")
public interface GreetClient {

    @GetMapping("/greet")
    String getGreeting();
}