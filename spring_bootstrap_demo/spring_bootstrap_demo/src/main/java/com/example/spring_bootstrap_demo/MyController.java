package com.example.spring_bootstrap_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/content")
    public String content()
    {
        return "myTemplate";
    }
}
