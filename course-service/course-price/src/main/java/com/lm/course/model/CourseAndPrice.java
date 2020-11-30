package com.lm.course.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * 课程与价格的融合类
 *
 * @author zhangfuqi
 * @date 2020/11/30
 */
public class CourseAndPrice implements Serializable {
    private static final long serialVersionUID = -5759479220599170401L;
    private Integer id;
    private Integer courseId;
    private String name;
    private Integer price;

    public CourseAndPrice() {
    }

    public CourseAndPrice(Integer id, Integer courseId, String name, Integer price) {
        this.id = id;
        this.courseId = courseId;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CourseAndPrice that = (CourseAndPrice) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(courseId, that.courseId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseId, name, price);
    }

    @Override
    public String toString() {
        return "CourseAndPrice{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
