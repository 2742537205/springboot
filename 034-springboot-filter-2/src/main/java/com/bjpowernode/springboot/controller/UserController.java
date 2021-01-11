package com.bjpowernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController  {

    @RequestMapping(value = "/user/detail")
    @ResponseBody
    public String userDetail(){
        return "/user/detail";
    }

    @RequestMapping(value = "center")
    @ResponseBody
    public String center(){
        return "center";
    }

}
