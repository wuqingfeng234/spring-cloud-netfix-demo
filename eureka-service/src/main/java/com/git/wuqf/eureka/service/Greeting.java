package com.git.wuqf.eureka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-client")
public interface Greeting {
    @RequestMapping("/greeting")
    String greeting();
}
