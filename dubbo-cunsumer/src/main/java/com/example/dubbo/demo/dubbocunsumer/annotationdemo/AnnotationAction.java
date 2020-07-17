package com.example.dubbo.demo.dubbocunsumer.annotationdemo;

import com.dubbo.inter.demo.People;
import com.dubbo.inter.demo.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component("annotationAction")
//@Component
public class AnnotationAction {

    @Reference(check = false)
    private UserService userService;

    @Reference(check = false)
    private People peopleService;
    
    public String doSayHello(String name) {
        return userService.sayHello(name);
    }

    public String doHaoren(String name) {
        return peopleService.zuogerenba(name);
    }

}
