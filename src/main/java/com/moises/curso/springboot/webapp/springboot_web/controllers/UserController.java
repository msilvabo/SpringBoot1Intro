package com.moises.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class UserController {

    @GetMapping("/details")
    public String details(Map<String, Object> model){
        model.put("title", "Hola Mundo SpringBoot");
        model.put("name", "Moisés");
        model.put("lastName", "Silva");
        return "details";
    }
}
