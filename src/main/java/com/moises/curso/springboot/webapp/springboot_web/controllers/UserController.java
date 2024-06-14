package com.moises.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moises.curso.springboot.webapp.springboot_web.models.User;

@Controller
@RequestMapping("/api")
public class UserController {

    @GetMapping("/details")
    public String details(Map<String, Object> model){
        User user = new User("Moisés","Silva");
        user.setEmail("silva.moises@gmail.com");
        model.put("title", "Hola Mundo SpringBoot");
        model.put("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        User user1 = new User("Moisés","Silva", "silva.moises@gmail.com");
        User user2 = new User("Patricia","Pallares", "patitopallares@gmail.com");
        User user3 = new User("Samanta","Silva");
        User user4 = new User("Zuhelen","Silva");

        List<User> users = Arrays.asList(user1, user2, user3, user4);
        model.addAttribute("users", users);
        model.addAttribute("title", "Lista de usuarios");
        return "list";
    }
}
