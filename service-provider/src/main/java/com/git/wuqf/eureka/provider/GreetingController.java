package com.git.wuqf.eureka.provider;

import com.git.wuqf.eureka.service.Greeting;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
public class GreetingController implements Greeting {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Override
    public String greeting() {
        return String.format(
                "Hello from '%s'! date is '%s'", eurekaClient.getApplication(appName).getName(), ZonedDateTime.now());

    }
}
