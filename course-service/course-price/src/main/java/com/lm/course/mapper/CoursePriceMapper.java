package com.lm.course.mapper;

import com.lm.course.model.CoursePrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author zhangfuqi
 * @date 2020/11/27
 */
@Mapper
@Repository
public interface CoursePriceMapper {
    /**
     * 获取课程价格
     *
     * @param courseId 课程id
     * @return CoursePrice
     */
    @Select("select * from course_price where course_id=#{courseId}")
    CoursePrice findCoursePrice(@Param("courseId") Integer courseId);
}
