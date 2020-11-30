package com.lm.course.service.impl;

import com.lm.course.mapper.CourseListMapper;
import com.lm.course.model.Course;
import com.lm.course.service.CourseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 课程服务实现类
 *
 * @author zhangfuqi
 * @date 2020/11/27
 */
@Service
public class CourseListServiceImpl implements CourseListService {
    @Autowired
    private CourseListMapper courseListMapper;

    @Override
    public List<Course> getCourseList() {
        return courseListMapper.findValidCourse();
    }
}
