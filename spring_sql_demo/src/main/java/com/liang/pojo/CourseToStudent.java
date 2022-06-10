package com.liang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
public class CourseToStudent {
    private int scId;
    private int sId;
    private int cId;
}
