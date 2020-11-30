package com.lm.course.controller;

import com.lm.course.client.CourseListClient;
import com.lm.course.model.Course;
import com.lm.course.model.CourseAndPrice;
import com.lm.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangfuqi
 * @date 2020/11/27
 */
@RestController
public class CoursePriceController {
    @Autowired
    private CoursePriceService coursePriceService;

    @Autowired
    private CourseListClient courseListClient;

    @GetMapping("/price/{courseId}")
    public Integer getCoursePrice(@PathVariable("courseId") Integer courseId) {
        return coursePriceService.getCoursePrice(courseId).getPrice();
    }

    @GetMapping("/coursesInPrice")
    public List<Course> getCourseListInPrice(Integer courseId) {
        return courseListClient.courseList();
    }

    @GetMapping("/coursesAndPrice")
    public List<CourseAndPrice> getCourseAndPrice(){
        return  coursePriceService.getCoursesAndPrice();
    }
}
