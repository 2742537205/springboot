package com.bjpowernode.springboot.web;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StudentService;

    @Controller
    public class StudentController {

        @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
        private StudentService studentService;

        @RequestMapping(value = "/student/count")
        @ResponseBody
        public Object studentCount(){
            Integer all = studentService.query();
            return "总人数"+all;
        }
}
