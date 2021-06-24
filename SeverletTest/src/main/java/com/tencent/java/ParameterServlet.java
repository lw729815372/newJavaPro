package com.tencent.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class ParameterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //必须在第一次获取参数值之前使用才有效
        request.setCharacterEncoding("UTF-8");
        System.out.println("_____POST______");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");
        System.out.println("用户名："+ username);
        System.out.println("密码："+ password);
        System.out.println("兴趣爱好："+ Arrays.asList(hobby));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");
        System.out.println("用户名："+ username);
        System.out.println("密码："+ password);
        System.out.println("兴趣爱好："+ Arrays.asList(hobby));
    }
}
