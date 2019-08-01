package com.czxy.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "signin")
public class Signin {
    /**
     * 用户Id
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 上一次签到时间
     */
    @Column(name = "sign_lastTime")
    private Date signLasttime;

    /**
     * 连续签到天数
     */
    @Column(name = "sign_continuityTimes")
    private Integer signContinuitytimes;

    /**
     * 总签到天数
     */
    @Column(name = "sign_totalTimes")
    private Integer signTotaltimes;
}