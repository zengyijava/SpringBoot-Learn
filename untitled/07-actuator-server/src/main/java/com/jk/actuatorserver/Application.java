package com.jk.actuatorserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAdminServer   //开启SBA server
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
