package com.jk.jpa.bean;


import jdk.jfr.events.CertificateId;
import lombok.Data;

@Data//代替get，set等方法
public class Student {
//    @Id
//    @
    private int id;
    private String name;
    private int age;
    private double score;


}
