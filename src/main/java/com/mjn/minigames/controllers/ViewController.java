package com.mjn.minigames.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/indexPage")
    public String viewIndexPage(){
        return "indexPage";
    }
}
