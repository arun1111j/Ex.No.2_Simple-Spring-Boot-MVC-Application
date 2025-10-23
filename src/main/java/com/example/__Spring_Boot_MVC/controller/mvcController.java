package com.example.__Spring_Boot_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
@Controller
public class mvcController {
    @GetMapping("/getDetails")
    public String home(Model model)
    {
        model.addAttribute("message","hello world");
        return "index";

    }



}
