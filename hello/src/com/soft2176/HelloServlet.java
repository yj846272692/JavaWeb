package com.soft2176;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/2/21 14:00
 */
@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected  void  service(HttpServletRequest req , HttpServletResponse resp) throws ServletException , IOException{
        resp.getWriter().println("hello world");
    }


}
