package com.lm.course.client;

import com.lm.course.model.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 断路器实现类
 *
 * @author zhangfuqi
 * @date 2020/11/30
 */
@Component
public class CourseListClientHystrix implements CourseListClient {
    @Override
    public List<Course> courseList() {
        ArrayList<Course> defaultCourses = new ArrayList<>();
        Course course = new Course(1, 1, "默认课程", 1);
        defaultCourses.add(course);
        return defaultCourses;
    }
}
