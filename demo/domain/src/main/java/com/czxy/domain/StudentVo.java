package com.czxy.domain;

import lombok.Data;

import java.util.List;

/**
 * @author Lenovo
 * @version v 1.0
 * @date 2019/7/30
 */
@Data
public class StudentVo {

    private Student student;


    private List<Major> majorList;

}
