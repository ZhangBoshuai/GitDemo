package com.czxy.domain;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "major")
public class Major {
    @Id
    @Column(name = "major_id")
    @GeneratedValue(generator = "JDBC")
    private Integer majorId;

    @Column(name = "major_name")
    private String majorName;

    @Column(name = "major_describe")
    private String majorDescribe;

    @Column(name = "college_cid")
    private Integer collegeCid;

    private College college;
}