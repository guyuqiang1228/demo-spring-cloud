package com.pika.boot.filters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author guyuqiang
 * @create 2021-03-15
 * <p>
 * WebFilter注解无法指定order值(优先级)，不推荐使用
 * 可使用@Order指定
 */
@Slf4j
@WebFilter(urlPatterns = "/*", filterName = "myFilter2")
@Order(2)
public class MyFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("MyFilter2---init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("MyFilter2---doFilter");
        // 放行请求
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        log.info("MyFilter2---destroy");
    }

}
