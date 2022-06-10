package com.liang;

import com.liang.mapper.CourseMapper;
import com.liang.mapper.CourseToStudentMapper;
import com.liang.mapper.StudentMapper;
import com.liang.pojo.Course;
import com.liang.pojo.CourseToStudent;
import com.liang.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseToStudentTest {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private CourseToStudentMapper courseToStudentMapper;

    @Test
    public void insertCourseToStudentTest(){
        Student student = studentMapper.selectById(4);
        Course course = courseMapper.selectCourseById(7);
        CourseToStudent courseToStudent = new CourseToStudent(10,student.getId(),course.getId());
        int i = courseToStudentMapper.insertCourseToStudent(courseToStudent);
        System.out.println(i);
    }


}
