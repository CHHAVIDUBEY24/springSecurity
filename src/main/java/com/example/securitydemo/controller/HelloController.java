package com.example.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/public")
    public String publicApi()
    {
        return "This is public Api";
    }
    @GetMapping("/private")
    public String privateApi()
    {
        return "This is private Api";
    }
}

