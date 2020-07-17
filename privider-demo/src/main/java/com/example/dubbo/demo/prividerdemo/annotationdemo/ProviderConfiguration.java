package com.example.dubbo.demo.prividerdemo.annotationdemo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.example.dubbo.demo.prividerdemo")
@PropertySource("classpath:/application.properties")
public class ProviderConfiguration {
       
}