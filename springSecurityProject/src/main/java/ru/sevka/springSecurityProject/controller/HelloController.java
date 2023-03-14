package ru.sevka.springSecurityProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
@Controller
public class HelloController {

    @GetMapping
    public String sayHello(){
        return "hello";
    }

}
