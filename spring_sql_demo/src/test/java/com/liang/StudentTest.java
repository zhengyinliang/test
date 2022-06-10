package com.liang;


import com.liang.mapper.StudentMapper;
import com.liang.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class StudentTest {
    @Autowired
    private StudentMapper studentMapper;

    //查询所有数据
    @Test
    public void getAll(){
        List<Student> all = studentMapper.getAllStudents();
        for (Student student :all){
            System.out.println("test");
            System.out.println(student.toString());
        }
    }

    @Test
    public void getByCondition(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("stud_name","l");
        map.put("sex",1);
        map.put("grade",2);
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<Student> all = studentMapper.selectByCondition(map);
        for (Student student :all){
            System.out.println("test1");
            System.out.println(student.toString());
        }
    }
    @Test
    public void insertStudentTest(){
        Student student = new Student(3,"hhh",0,3);
        int i = studentMapper.addStudent(student);
    }

    @Test
    public void updateStudentTest(){
        Student student = studentMapper.selectById(1);
        student.setGrade(2);
        int i = studentMapper.updateStudent(student);
        System.out.println(i);
        System.out.println(studentMapper.selectById(1).toString());
    }

    @Test
    public void deleteByIdTest(){
        System.out.println(studentMapper.selectById(3).toString());
        int i = studentMapper.deleteStudentById(3);
        System.out.println(i);
    }
}
