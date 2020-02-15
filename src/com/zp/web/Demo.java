package com.zp.web;
/*
pojo 表对应的实体类
dao java对数据库操作
service 逻辑关系
web servlet对service数据在页面上显示,处理不同的请求响应到页面
 */
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        //对象什么时候被创建：发送第一次请求时创建对象,对象初始化(等待的时间长)
        //启动服务器(将对象创建)，把对象进行提前创建、初始化，用户访问时不用等待创建对象。
        //加了load-on-starup标签，在服务器启动时会执行init()；
        System.out.println(config.getServletName());
        System.out.println(config.getInitParameter("username"));//初始化参数卸载init标签
        System.out.println("初始化");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getCharacterEncoding();
//        resp.setCharacterEncoding("utf-8");
//        System.out.println("的房间看来大家");
//        resp.setContentType("text/html;charset=utf-8");
//        PrintWriter writer=resp.getWriter();
//        writer.write("风纪扣JFK")
//        ;
//        String str="servlet date";
//        req.setAttribute("test",str);
//        req.getRequestDispatcher("index.jsp").forward(req,resp);//转发，地址栏不变化，一次请求
        resp.sendRedirect("http://www.baidu.com");//重定向，地址栏变化，两次请求

    }
}
