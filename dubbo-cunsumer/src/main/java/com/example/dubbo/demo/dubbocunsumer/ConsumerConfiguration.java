package com.example.dubbo.demo.dubbocunsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * dubbo配置项
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.example.dubbo.demo.dubbocunsumer.annotationdemo")
@PropertySource("classpath:/application-dubbo.properties")
@ComponentScan(value = {"com.example.dubbo.demo.dubbocunsumer.annotationdemo"})
public class ConsumerConfiguration {

}