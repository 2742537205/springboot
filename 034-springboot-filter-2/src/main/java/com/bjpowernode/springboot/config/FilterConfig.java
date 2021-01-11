package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.filter.Myfilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean my(){
        //注册过滤器
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new Myfilter());

        //添加过滤器路径
        filterRegistrationBean.addUrlPatterns("/user/*");

        return filterRegistrationBean;
    }

}
