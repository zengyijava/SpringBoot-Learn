package com.jk.jsp.jspController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class JspController {
    @GetMapping("/jsp")
    public String showJSP(Model model){
        model.addAttribute("msg","hello");
        return "test";

    }
}
