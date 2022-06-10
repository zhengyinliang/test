package com.liang.mapper;

import com.liang.pojo.Student;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.Map;

@Controller
public interface StudentMapper {


    int addStudent(Student student);

    int deleteStudentById(int id);

    int updateStudent(Student student);

    List<Student> getAllStudents();

    List<Student> selectByCondition(Map<String, Object> map);

    Student selectById(int id);



}
