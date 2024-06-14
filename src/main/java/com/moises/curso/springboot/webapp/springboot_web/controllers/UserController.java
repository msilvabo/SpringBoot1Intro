package com.moises.curso.springboot.webapp.springboot_web.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

        model.addAttribute("title", "Lista de usuarios");
        return "list";
    }

    @ModelAttribute("users")    
    public List<User> usersModel(){
        return Arrays.asList(
            new User("Moisés","Silva", "silva.moises@gmail.com"),
            new User("Patricia","Pallares", "patitopallares@gmail.com"),
            new User("Samanta","Silva"),
            new User("Zuhelen","Silva"));
    }
}
