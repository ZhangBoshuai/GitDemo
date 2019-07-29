package com.czxy.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "course")
public class Course {
    /**
     * ID
     */
    @Id
    @Column(name = "course_cid")
    @GeneratedValue(generator = "JDBC")
    private Integer courseCid;

    /**
     * 课程名
     */
    @Column(name = "course_name")
    private String courseName;

    /**
     * 学分
     */
    @Column(name = "course_credit")
    private Integer courseCredit;

    /**
     * 时长
     */
    @Column(name = "course_time")
    private Integer courseTime;

    /**
     * 课程描述
     */
    @Column(name = "course_depict")
    private String courseDepict;

    /**
     * 是否必修
     */
    @Column(name = "course_required")
    private String courseRequired;

    /**
     * 学院ID
     */
    @Column(name = "college_id")
    private Integer collegeId;

    private College college;
}