package com.qusaidev.springboot.firstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    /** TODO expose '/' that return hello world*/

    @GetMapping("/")
    public String sayHello() {
        return "<h1>Hello World</h1>";
    }
}
