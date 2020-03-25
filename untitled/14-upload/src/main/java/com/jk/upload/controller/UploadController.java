package com.jk.upload.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadController {

    @GetMapping
    public String Upload(){
        return "upload";
    }

}
