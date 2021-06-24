package com.tencent.java;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ServerletHello implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init被调用");
    }

    public ServerletHello() {
        System.out.println("构造器被调用");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 专门用来处理请求响应
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servelet被访问了");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        if ("GET".equals(method)){
            System.out.println("是get请求");
        }else if ("POST".equals(method)){
            System.out.println("是post请求");
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy被调用");
    }
}
