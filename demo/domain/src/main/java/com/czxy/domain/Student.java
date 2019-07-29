package com.czxy.domain;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "student")
public class Student {
    /**
     * 学生id
     */
    @Id
    @Column(name = "student_id")
    @GeneratedValue(generator = "JDBC")
    private Integer studentId;

    /**
     * 学生姓名
     */
    @Column(name = "student_name")
    private String studentName;

    /**
     * 性别
     */
    @Column(name = "student_sex")
    private String studentSex;

    /**
     * 联系方式
     */
    @Column(name = "student_phone")
    private String studentPhone;

    /**
     * 出生日期
     */
    @Column(name = "student_birthday")
    private Date studentBirthday;

    /**
     *  邮箱
     */
    @Column(name = "student_email")
    private String studentEmail;

    /**
     * 所属学年
     */
    @Column(name = "student_year")
    private String studentYear;

    /**
     * 所属学期
     */
    @Column(name = "student_semester")
    private String studentSemester;

    /**
     * 所选专业id

     */
    @Column(name = "major_id")
    private Integer majorId;


    private Major major;

    /**
     * 描述
     */
    @Column(name = "student_describe")
    private String studentDescribe;
}