package com.jk.freemarker.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(Exception.class)
    public void HandleError(Exception e, HandlerMethod handlerMethod){
        System.out.println("统一异常处理");
        System.out.println(e.getMessage());
        System.out.println(handlerMethod.getBean().getClass());
        System.out.println(handlerMethod.getMethod().getName());


    }
}
