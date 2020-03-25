package com.jk.thymeleaf.controller;

import com.jk.thymeleaf.bean.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThymeleafController {

    @RequestMapping("/first")
    public String first(Model model){
        model.addAttribute("name","jk");

        User user=new User();
        user.setId(23);
        user.setName("james");


        //视图解释器默认后缀是.html
        return "index";
    }
}
