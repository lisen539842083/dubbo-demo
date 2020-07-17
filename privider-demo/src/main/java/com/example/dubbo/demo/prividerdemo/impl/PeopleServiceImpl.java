package com.example.dubbo.demo.prividerdemo.impl;

import com.dubbo.inter.demo.People;
import org.apache.dubbo.config.annotation.Service;

/**
 * @description:
 * @projectName:privider-demo
 * @see:com.example.dubbo.demo.prividerdemo.impl
 * @author:李森
 * @createTime:2020/7/17 下午4:02
 */
@Service
public class PeopleServiceImpl implements People {
    @Override
    public String zuogerenba(String name) {
        return "是个好人-----"+name;
    }
}
