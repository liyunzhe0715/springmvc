package com.lyz.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author liyunzhe
 * @create 2020-12-03
 */
public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}