package com.liang.mapper;

import com.liang.pojo.Course;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Controller
public interface CourseMapper {
    int addCourse(Course course);

    int deleteCourseById(int id);

    int updateCourse(Course course);

    Course selectCourseById(int id);

    List<Course> searchCourseByCondition(Map<String, Object> map);
}
