package com.lm.course.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * 课程实体类
 *
 * @author zhangfuqi
 * @date 2020/11/27
 */
public class Course implements Serializable {
    private static final long serialVersionUID = 1755553991272297481L;

    private Integer id;
    private Integer courseId;
    private String name;
    private Integer valid;


    public Course() {
    }

    public Course(Integer id, Integer courseId, String name, Integer valid) {
        this.id = id;
        this.courseId = courseId;
        this.name = name;
        this.valid = valid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", name='" + name + '\'' +
                ", valid=" + valid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Course course = (Course) o;
        return Objects.equals(id, course.id) &&
                Objects.equals(courseId, course.courseId) &&
                Objects.equals(name, course.name) &&
                Objects.equals(valid, course.valid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseId, name, valid);
    }
}
