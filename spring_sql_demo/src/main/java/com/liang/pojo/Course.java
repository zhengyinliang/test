package com.liang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@AllArgsConstructor
public class Course implements Serializable{
    private Integer id;
    private String courseName;
    private float credit;
}
