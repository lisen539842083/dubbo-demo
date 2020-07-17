package com.example.dubbo.demo.dubbocunsumer;

import com.example.dubbo.demo.dubbocunsumer.annotationdemo.AnnotationAction;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 这是启动项
 */
//@Configuration
//@EnableDubbo(scanBasePackages = "com.example.dubbo.demo.dubbocunsumer.annotationdemo")
//@ComponentScan(value = {"com.example.dubbo.demo.dubbocunsumer.annotationdemo"})
@SpringBootApplication
public class DubboCunsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(DubboCunsumerApplication.class, args);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
//        context.start();
//        final AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");
//        String hello = annotationAction.doSayHello("world");
//        System.out.println("hello----"+hello);

    }

}
