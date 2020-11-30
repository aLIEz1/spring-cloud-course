package com.lm.course.client;

import com.lm.course.model.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Primary 有多个同类型的bean的时候加了这个注解的会优先选择注入
 * 课程列表Feign客户端
 *
 * @author zhangfuqi
 * @date 2020/11/28
 */
@FeignClient(value = "course-list", fallback = CourseListClientHystrix.class)
@Primary
public interface CourseListClient {
    /**
     * 获取课程列表
     *
     * @return 课程列表
     */

    @GetMapping("/courses")
    List<Course> courseList();
}
