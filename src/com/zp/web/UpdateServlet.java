package com.zp.web;

import com.zp.pojo.Student;
import com.zp.service.IStudentService;
import com.zp.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateServlet extends HttpServlet {

    private IStudentService service=new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer sno=Integer.parseInt(req.getParameter("sno"));
        //带到下一个要修改的页面
        Student student=service.getOne(sno);
        req.setAttribute("student",student);
        req.getRequestDispatcher("update.jsp").forward(req,resp);

    }
}
