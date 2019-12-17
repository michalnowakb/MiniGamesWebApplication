package com.mjn.minigames.controllers;

import com.mjn.minigames.entities.UserEntity;
import com.mjn.minigames.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    UserServices userServices;

    @GetMapping("/user/getUsers")
    public String getUsers(Model model){
        model.addAttribute("users", userServices.getAll());
        return "viewUserPage";
    }

    @GetMapping("/user/getUser/{id}")
    public String getUser(@PathVariable("id") int id,Model model){
        model.addAttribute("user", userServices.getById(id));
        return "viewUserPage";
    }

    @PostMapping("/user/addUser")
    public String addUser(@Valid UserEntity user){
        userServices.addUser(user);
        return "registerUserPage";
    }
}
