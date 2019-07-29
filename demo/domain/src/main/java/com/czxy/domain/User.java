package com.czxy.domain;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`user`")
public class User {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "user_id")
    @GeneratedValue(generator = "JDBC")
    private Integer userId;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 用户密码
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 图片路径
     */
    @Column(name = "head_img")
    private String headImg;
}