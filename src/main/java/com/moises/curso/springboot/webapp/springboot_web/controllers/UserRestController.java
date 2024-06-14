package com.moises.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moises.curso.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/detailsRest")
    public Map<String, Object> detailsRest(){
        User user = new User("Moisés","Silva");
        
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo SpringBoot");
        body.put("user",user);
        return body;
    }
}
