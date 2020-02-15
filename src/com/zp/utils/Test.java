package com.zp.utils;

import com.zp.dao.impl.StudentDAOImpl;
import com.zp.pojo.Student;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> list= new StudentDAOImpl().getAll();
        for (Student l:list) {
            System.out.println(l);
        }
    }

}
