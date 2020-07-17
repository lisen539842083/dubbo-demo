package com.example.dubbo.demo.dubbocunsumer;


import com.dubbo.inter.demo.User;
import com.dubbo.inter.demo.UserService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @projectName:dubbo-cunsumer
 * @see:com.example.dubbo.demo.dubbocunsumer
 * @author:李森
 * @createTime:2020/7/10 下午4:07
 */

@Component
@Configuration
public class ConsumerDemo {

    public static void main(String[] args) {
        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("yyy");

        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://47.111.248.53:2183");
        registry.setUsername("admin");
        registry.setPassword("lisen0107");

        // 注意：ReferenceConfig为重对象，内部封装了与注册中心的连接，以及与服务提供方的连接

        // 引用远程服务
        ReferenceConfig<UserService> reference = new ReferenceConfig<>(); // 此实例很重，封装了与注册中心的连接以及与提供者的连接，请自行缓存，否则可能造成内存和连接泄漏
        reference.setApplication(application);
        reference.setRegistry(registry); // 多个注册中心可以用setRegistries()
        reference.setInterface(UserService.class);
        reference.setVersion("1.0.0");

        // 和本地bean一样使用xxxService
        UserService userService = reference.get(); // 注意：此代理对象内部封装了所有通讯细节，对象较重，请缓存复用
        String hehe = userService.sayHello("212");
        System.out.println("输出-----"+hehe);
    }
}
