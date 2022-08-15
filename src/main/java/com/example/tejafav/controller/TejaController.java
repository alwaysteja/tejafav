package com.example.tejafav.controller;

import com.example.tejafav.aboutme.Me;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TejaController {
@Autowired
Me me;

    @GetMapping("/")
    public String welcome(){

        return "Welcome to our API,if you want to know about me add whoami in url above";
    }
    @GetMapping("/whoamI")
    public Me whoAmI(){

        return me;
    }
}
