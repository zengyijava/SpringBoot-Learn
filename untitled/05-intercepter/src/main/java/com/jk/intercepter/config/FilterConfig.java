package com.jk.intercepter.config;

import com.jk.intercepter.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //相对于Beans
public class FilterConfig {

    @Bean
    public FilterRegistrationBean MyFilterRegistrationBean(){
        FilterRegistrationBean frb=new FilterRegistrationBean(new MyFilter());
        //过滤全部请求
        frb.addUrlPatterns("/*");
        return frb;
    }
}
