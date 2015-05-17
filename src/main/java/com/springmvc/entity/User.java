package com.springmvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/5/17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private int id;
    private String name;
    private String pwd;
    private int age;
}
