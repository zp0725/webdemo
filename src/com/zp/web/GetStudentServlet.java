package com.zp.web;

import com.zp.pojo.Student;
import com.zp.service.IStudentService;
import com.zp.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetStudentServlet extends HttpServlet {
    private IStudentService service=new StudentServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students=service.getAll();
//        for (Student s:students
////             ) {
////            System.out.println(s);
////
////        }
        req.setAttribute("students",students);
        req.getRequestDispatcher("student.jsp").forward(req,resp);

}
}
