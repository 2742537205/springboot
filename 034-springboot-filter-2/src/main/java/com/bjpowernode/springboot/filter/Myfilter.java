package com.bjpowernode.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

public class Myfilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
