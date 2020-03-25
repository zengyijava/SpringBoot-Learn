package com.jk.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jk.mybatis.mapper")//会扫描该包下的接口
//@EnableTransactionManagement //开启事务支持

public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
