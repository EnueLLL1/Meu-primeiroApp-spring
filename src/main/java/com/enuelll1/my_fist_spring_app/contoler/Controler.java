package com.enuelll1.my_fist_spring_app.contoler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello, World!";
    }
}
