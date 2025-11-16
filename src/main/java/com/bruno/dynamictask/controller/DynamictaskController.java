package com.bruno.dynamictask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DynamictaskController {

    @GetMapping("/")
    public String getViewName(Model model){

        model.addAttribute("welcomeMessage", "Welcome to Dynamic Task");

        return "index";
    }

}
