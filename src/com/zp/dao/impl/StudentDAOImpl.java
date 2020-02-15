package com.zp.dao.impl;

import com.zp.dao.IStudentDAO;
import com.zp.pojo.Student;
import com.zp.utils.DBUtil;
import com.zp.utils.RowMap;
import com.zp.utils.WorkDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements IStudentDAO {
    @Override
    public List<Student> getAll() {

       return DBUtil.query("select* from Student", new RowMap<Student>() {
            @Override
            public Student RowMapping(ResultSet rs) {
                Student student=new Student();
                try {
                    student.setSno(rs.getInt("sno"));
                    student.setSsex(rs.getString("ssex"));
                    student.setDept(rs.getString("dept"));
                    student.setSage(rs.getString("sage"));
                    student.setSname(rs.getString("sname"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return student;
            }
        },null);
    }

    @Override
    public void addStudent(Student student) {
        DBUtil.executeUpdate("insert into student(sno,sname,sage,ssex,dept) values(?,?,?,?,?)",student.getSno(),student.getSname(),student.getSage(),student.getSsex(),student.getDept());
    }

    @Override
    public void deleteStudent(Integer sno) {
        DBUtil.executeUpdate("delete from student where sno=?",sno);
    }

    @Override
    public Student getOne(Integer sno) {
       return DBUtil.queryOne("select* from student where sno=?", new RowMap<Student>() {

            @Override
            public Student RowMapping(ResultSet rs) {
                Student student=new Student();
                try {
                    student.setSno(rs.getInt("sno"));
                    student.setSsex(rs.getString("ssex"));
                    student.setDept(rs.getString("dept"));
                    student.setSage(rs.getString("sage"));
                    student.setSname(rs.getString("sname"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            return student;
            }
        },sno);

    }

    @Override
    public void updateStudent(Student student) {
        DBUtil.executeUpdate("update student set sname=?,sage=?,ssex=?,dept=? where sno=?",student.getSname(),student.getSage(),student.getSsex(),student.getDept(),student.getSno());
    }
}
