package com.liang;

import com.liang.mapper.CourseMapper;
import com.liang.pojo.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class CourseTest {
    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void addCourse(){
        Course course = new Course(9,"spring",3.0f);
        int i = courseMapper.addCourse(course);
        System.out.println(i);
    }

    @Test
    public void deleteCourse(){
        int i = courseMapper.deleteCourseById(9);
        System.out.println(i);
    }

    @Test
    public void updateCourseTest(){
        Course course = courseMapper.selectCourseById(7);
        System.out.println(course.toString());
        course.setCredit(2.0f);
        int i = courseMapper.updateCourse(course);
        System.out.println(i);
    }

    @Test
    public void searchCourseByConditionTest(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("course_name","j");
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<Course> courses = courseMapper.searchCourseByCondition(map);
        for(Course course : courses){
            System.out.println(course.toString());
        }
    }

}
