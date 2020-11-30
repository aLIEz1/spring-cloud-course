package com.lm.course.mapper;

import com.lm.course.model.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 课程的mapper类
 *
 * @author zhangfuqi
 * @date 2020/11/27
 */
@Mapper
@Repository
public interface CourseListMapper {
    /**
     * 寻找所有上架的书籍
     *
     * @return 已上架的书籍
     */
    @Select("select * from course where valid=1")
    List<Course> findValidCourse();
}
