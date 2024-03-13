package com.qusaidev.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        return "plain-login";
    }

    @GetMapping("")
    public String processLogin() {
        return "redirect:/";
    }
}
