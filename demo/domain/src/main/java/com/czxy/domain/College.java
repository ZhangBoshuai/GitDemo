package com.czxy.domain;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "college")
public class College {
    /**
     * 学院ID
     */
    @Id
    @Column(name = "college_id")
    @GeneratedValue(generator = "JDBC")
    private Integer collegeId;

    /**
     * 学院名称
     */
    @Column(name = "college_name")
    private String collegeName;
}