package com.lm.course.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author zhangfuqi
 * @date 2020/11/27
 */
public class CoursePrice implements Serializable {
    private static final long serialVersionUID = -8812326736699851514L;

    private Integer id;
    private Integer courseId;
    private Integer price;

    public CoursePrice() {
    }

    public CoursePrice(Integer id, Integer courseId, Integer price) {
        this.id = id;
        this.courseId = courseId;
        this.price = price;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoursePrice that = (CoursePrice) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(courseId, that.courseId) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseId, price);
    }

    @Override
    public String toString() {
        return "CoursePrice{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", price=" + price +
                '}';
    }
}
