package com.copic.copicgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CopicGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CopicGatewayApplication.class, args);
    }

}
