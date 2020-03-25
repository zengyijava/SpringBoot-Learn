package com.jk.mybatis.bean;


import lombok.Data;

@Data//代替get，set等方法
public class Student {
    private int id;
    private String name;
    private int age;
    private double score;


}
