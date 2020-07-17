package com.example.dubbo.demo.prividerdemo.impl;

import com.dubbo.inter.demo.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @description:
 * @projectName:privider-demo
 * @see:com.example.dubbo.demo.prividerdemo.impl
 * @author:李森
 * @createTime:2020/7/10 下午3:49
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "annotation: hello, " + name;
    }
}

