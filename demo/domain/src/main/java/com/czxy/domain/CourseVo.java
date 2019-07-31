package com.czxy.domain;

import java.util.ArrayList;
import java.util.List;

public class CourseVo {
    private Course course;
    private List<College>courseList=new ArrayList<>();

    @Override
    public String toString() {
        return "CourseVo{" +
                "course=" + course +
                ", courseList=" + courseList +
                '}';
    }

    public CourseVo() {
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<College> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<College> courseList) {
        this.courseList = courseList;
    }

    public CourseVo(Course course, List<College> courseList) {
        this.course = course;
        this.courseList = courseList;
    }
}
