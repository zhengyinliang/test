package com.liang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@AllArgsConstructor
public class Student implements Serializable {
    private Integer id;
    private String studName;
    private int sex;
    private Integer grade;
}
