package com.example.Spring_Thymeleaf_Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class myController {

    @GetMapping("/content")
    public String content()
    {
        return "myTemplate";
    }
}
