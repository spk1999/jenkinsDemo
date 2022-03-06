package com.sujan.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
public class HomeController {


    @GetMapping
    public List<String> getHome()
    {
        return List.of("home1","home2","home3");
    }

}
