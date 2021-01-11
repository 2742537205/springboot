package com.bjpowernode.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.StudentService;

@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Override
    public int query() {
        return 1010;
    }
}
