package com.jk.freemarker.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FreeMarkerController {

    @GetMapping("/freemarker")
    public String FreeMarker(Model model){
        int i=1/0;
        model.addAttribute("name","dj");
        return "index";

    }
}
