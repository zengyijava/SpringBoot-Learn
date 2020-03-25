package com.jk.test.controller;


import com.jk.autoconfigure.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/validate")
    public String validate(){
        boolean validate=userService.validata();
        return validate+"";
    }

}
