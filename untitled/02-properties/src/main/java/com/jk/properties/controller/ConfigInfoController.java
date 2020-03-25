package com.jk.properties.controller;


import com.jk.properties.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
自定义配置方法一
 */
@RestController
public class ConfigInfoController {
    @Value("zhangsan")
    private String name1;

    @Value("${school.address}")
    private String address1;

    @Value("${school.age}")
    private  int age1;

    @GetMapping("/init1")
    public String initConfigInfo1(){
        return name1+","+address1+","+age1;
    }


    /*
    自定义方法配置二
     */

    @Autowired
    private ConfigInfo configInfo;

    @GetMapping("/init2")
    public int init2(){
        return configInfo.getAge();
    }


}
