package com.zp.web;

import com.zp.pojo.Student;
import com.zp.service.IStudentService;
import com.zp.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoUpdateServlet extends HttpServlet {
    private IStudentService service=new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student=new Student();
        student.setSno(Integer.parseInt(req.getParameter("sno")));
        student.setSname(req.getParameter("sname"));
        student.setSage(req.getParameter("sage"));
        student.setSsex(req.getParameter("ssex"));
        student.setDept(req.getParameter("dept"));
        service.updateStudent(student);
        resp.sendRedirect("getStudent");

    }
}
