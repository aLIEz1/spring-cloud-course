package com.lm.course.service;

import com.lm.course.model.Course;

import java.util.List;

/**
 * 课程列表服务
 *
 * @author zhangfuqi
 * @date 2020/11/27
 */
public interface CourseListService {
    /**
     * 获得课程列表
     *
     * @return 课程列表
     */
    List<Course> getCourseList();
}
