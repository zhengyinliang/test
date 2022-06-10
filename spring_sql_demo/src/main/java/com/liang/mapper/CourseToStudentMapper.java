package com.liang.mapper;

import com.liang.pojo.CourseToStudent;
import org.springframework.stereotype.Controller;

@Controller
public interface CourseToStudentMapper {
    int insertCourseToStudent(CourseToStudent courseToStudent);


}
