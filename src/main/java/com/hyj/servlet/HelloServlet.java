package com.hyj.servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @version 1.0
 * @Authord yujie huang  email: 190158792@qq.com
 * @Description
 * @Date Create by in 16:17 2019/3/20
 */
@WebServlet(name = "helloServlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data = req.getParameter("text");
        System.out.println(data);
        System.out.println(this.getServletInfo());
        System.out.println(this.getServletConfig().getServletContext()==this.getServletContext());
        Enumeration<String> enumeration =  this.getServletConfig().getInitParameterNames();
        while (enumeration.hasMoreElements()){
            System.out.println("---"+enumeration.nextElement());
        }
        System.out.println("++"+this.getServletContext().getContextPath());
        System.out.println("++"+req.getContextPath());
        System.out.println("method:"+req.getMethod());
        System.out.println("uri:"+req.getRequestURI());
        System.out.println("queryString:"+req.getQueryString());
        System.out.println(Thread.currentThread().getName());
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("<h>  hello  </h>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        System.out.println("init");
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service");
        super.service(req, resp);
    }
}
