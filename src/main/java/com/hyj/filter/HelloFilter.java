package com.hyj.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @version 1.0
 * @Authord yujie huang  email: 190158792@qq.com
 * @Description
 * @Date Create by in 9:39 2019/3/21
 */
@WebFilter(filterName = "helloFilter")
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest rqs = (HttpServletRequest)request;
        System.out.println("拦截："+rqs.getRequestURI());
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
