package com.git.wuqf.eureka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * usage of feign client: @FeignClient(service-name)
 */
@FeignClient("spring-cloud-service-provider")
public interface Greeting {
    @RequestMapping("/greeting")
    String greeting();
}
