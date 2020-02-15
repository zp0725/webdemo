package com.zp.service.impl;

import com.zp.dao.IStudentDAO;
import com.zp.dao.impl.StudentDAOImpl;
import com.zp.pojo.Student;
import com.zp.service.IStudentService;

import java.util.List;

public class StudentServiceImpl implements IStudentService {
    private IStudentDAO dao=new StudentDAOImpl();
    @Override
    public List<Student> getAll() {
        return dao.getAll();
    }

    @Override
    public void addStudent(Student student) {
        dao.addStudent(student);
    }

    @Override
    public void deleteStudent(Integer sno) {
        dao.deleteStudent(sno);
    }

    @Override
    public Student getOne(Integer sno) {
        return dao.getOne(sno);
    }

    @Override
    public void updateStudent(Student student) {
        dao.updateStudent(student);
    }
}
