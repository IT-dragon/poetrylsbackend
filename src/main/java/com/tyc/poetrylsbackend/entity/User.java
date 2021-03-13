package com.tyc.poetrylsbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author TanYunChuan
 * @date 2021/3/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;
    private String gender;
    private String phone;
    private String remark;
    private Integer departmentid;
    private Integer roleid;
}
