package com.spring.cloud.servicerule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.spring.cloud.servicerule")
@EnableEurekaClient
public class ServiceRuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRuleApplication.class, args);
    }

}
