package com.jk.intercepter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@ServletComponentScan(basePackages = "com.jk.intercepter.filter")
//@ServletComponentScan(basePackages = "com.jk.intercepter.servlet")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
