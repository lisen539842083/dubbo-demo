package com.example.dubbo.demo.prividerdemo.provider;

import com.dubbo.inter.demo.UserService;
import com.example.dubbo.demo.prividerdemo.impl.UserServiceImpl;
import javafx.application.Application;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @description:api的方式
 * @projectName:privider-demo
 * @see:com.example.dubbo.demo.prividerdemo.provider
 * @author:李森
 * @createTime:2020/7/10 下午3:45
 */

public class ProviderDemo {

    public static void main(String[] args) throws IOException {
        init();
    }

    //手写api的方式
    static void init() throws IOException {
        // 服务实现
        UserService userService =  new UserServiceImpl();

        // 当前应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("UserProvider");

        // 连接注册中心配置
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://47.111.248.53:2183");
        registryConfig.setUsername("admin");
        registryConfig.setPassword("lisen0107");

        // 服务提供者协议配置
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(12345);
        protocolConfig.setThreads(20);

        // 注意：ServiceConfig为重对象，内部封装了与注册中心的连接，以及开启服务端口

        // 服务提供者暴露服务配置
        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(userService);
        serviceConfig.setVersion("1.0.0");

        // 暴露及注册服务
        serviceConfig.export();
        System.in.read();
    }
}
