package com.git.wuqf.eureka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * usage of feign client: @FeignClient(service-name)
 */
@FeignClient(value = "spring-cloud-service-provider",path = "/provider")
public interface Greeting {
    @RequestMapping("/greeting")
    String greeting();
}
