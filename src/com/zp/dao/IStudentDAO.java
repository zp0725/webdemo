package com.zp.dao;

import com.zp.pojo.Student;

import java.util.List;

public interface IStudentDAO {
    public List<Student> getAll();
    public void addStudent(Student student);
    public void deleteStudent(Integer sno);
    public Student getOne(Integer sno);
    public void updateStudent(Student student);
}
