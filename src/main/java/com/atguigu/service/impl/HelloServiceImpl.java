package com.atguigu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @created by Lenovo on 2020/12/22
 */
/*
@Service是dubbo的，可以进行远程注册
* */
//@Service(interfaceClass =HelloService.class )
@Service()
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello"+name;
    }
}
