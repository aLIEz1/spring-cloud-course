package com.lm.course.service.impl;

import com.lm.course.client.CourseListClient;
import com.lm.course.mapper.CoursePriceMapper;
import com.lm.course.model.Course;
import com.lm.course.model.CourseAndPrice;
import com.lm.course.model.CoursePrice;
import com.lm.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfuqi
 * @date 2020/11/27
 */
@Service
public class CoursePriceServiceImpl implements CoursePriceService {
    @Autowired
    private CoursePriceMapper coursePriceMapper;
    @Autowired
    private CourseListClient courseListClient;

    @Override
    public CoursePrice getCoursePrice(Integer courseId) {
        return coursePriceMapper.findCoursePrice(courseId);
    }

    @Override
    public List<CourseAndPrice> getCoursesAndPrice() {
        List<Course> courseList = courseListClient.courseList();
        ArrayList<CourseAndPrice> courseAndPriceArrayList = new ArrayList<>();
        for (Course course : courseList) {
            if (course != null) {
                CoursePrice coursePrice = getCoursePrice(course.getCourseId());
                CourseAndPrice courseAndPrice = new CourseAndPrice();
                courseAndPrice.setPrice(coursePrice.getPrice());
                courseAndPrice.setName(course.getName());
                courseAndPrice.setCourseId(course.getCourseId());
                courseAndPrice.setId(course.getId());
                courseAndPriceArrayList.add(courseAndPrice);
            }

        }
        return courseAndPriceArrayList;
    }
}
