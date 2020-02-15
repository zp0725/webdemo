package com.zp.web;

import com.zp.pojo.Student;
import com.zp.service.IStudentService;
import com.zp.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoAddServlet extends HttpServlet {
     private IStudentService service=new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer sno=Integer.parseInt(req.getParameter("sno")) ;
        String sname=req.getParameter("sname");
        String sage=req.getParameter("sage");
        String ssex=req.getParameter("ssex");
        String dept=req.getParameter("dept");
        Student s=new Student();
        s.setSname(sname);
        s.setSage(sage);
        s.setDept(dept);
        s.setSsex(ssex);
        s.setSno(sno);
        service.addStudent(s);
        resp.sendRedirect("getStudent");


    }
}
