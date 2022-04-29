package com.git.wuqf.feignclient;

import com.git.wuqf.eureka.service.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private Greeting greeting;

    @GetMapping("/get-greeting")
    public String greeting() {
        return greeting.greeting();
    }

}