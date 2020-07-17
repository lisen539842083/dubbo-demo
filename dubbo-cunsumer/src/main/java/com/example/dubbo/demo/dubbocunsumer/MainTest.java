package com.example.dubbo.demo.dubbocunsumer;

import com.example.dubbo.demo.dubbocunsumer.annotationdemo.AnnotationAction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 这是单独测试的main
 * @projectName:dubbo-cunsumer
 * @see:com.example.dubbo.demo.dubbocunsumer
 * @author:李森
 * @createTime:2020/7/13 下午3:23
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        final AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");
        String hello = annotationAction.doSayHello("world");
        System.out.println("hello----"+hello);
    }

}
