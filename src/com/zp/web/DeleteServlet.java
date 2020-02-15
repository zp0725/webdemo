package com.zp.web;

import com.zp.service.IStudentService;
import com.zp.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {
    private IStudentService service=new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("点击了删除");
        Integer sno=Integer.parseInt(req.getParameter("sno"));
        service.deleteStudent(sno);
        resp.sendRedirect("getStudent");
    }
}
