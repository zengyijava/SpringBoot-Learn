package com.jk.intercepter.config;

import com.jk.intercepter.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServlertConfig {

    @Bean
    public ServletRegistrationBean myServletRegistrationBean(){
        ServletRegistrationBean regist = new ServletRegistrationBean(new MyServlet());
        regist.addUrlMappings("/myservlet2");
        return regist;
    }

}
