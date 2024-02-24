package com.qusaidev.springboot.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormTwo")
    public String shoutName(HttpServletRequest request, Model model) {

        String name = request.getParameter("studentName");
        name = name.toUpperCase();

        String result = "HELLO " + name;

        model.addAttribute("message", result);

        return "helloworld";
    }

}
