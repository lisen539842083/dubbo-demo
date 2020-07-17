package com.example.dubbo.demo.prividerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(value = {})
@SpringBootApplication
public class PrividerDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(PrividerDemoApplication.class, args);
    }

}
