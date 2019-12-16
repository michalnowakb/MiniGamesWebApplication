package com.mjn.minigames.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    private String viewIndexPage(){
        return "indexPage";
    }
}
