package com.example.springcloud.demoeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class DemoEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaClientApplication.class, args);
    }
}