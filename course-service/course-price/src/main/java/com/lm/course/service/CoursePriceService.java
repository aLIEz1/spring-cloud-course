package com.lm.course.service;

import com.lm.course.model.CourseAndPrice;
import com.lm.course.model.CoursePrice;

import java.util.List;

/**
 * @author zhangfuqi
 * @date 2020/11/27
 */
public interface CoursePriceService {
    /**
     * 获取课程价格
     *
     * @param courseId 课程id
     * @return CoursePrice
     */
    CoursePrice getCoursePrice(Integer courseId);

    /**
     * 获取课程列表和价格
     *
     * @return CourseAndPrice
     */
   List<CourseAndPrice>  getCoursesAndPrice();
}
