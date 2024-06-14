package com.moises.curso.springboot.webapp.springboot_web.controllers;


// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moises.curso.springboot.webapp.springboot_web.models.User;
import com.moises.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserDtoRestController {

    @GetMapping("/detailsRestDto")
    public UserDto detailsRest(){
        User user = new User("Moisés","Silva");
        UserDto userDto = new UserDto();
        userDto.setTitle("Hola Mundo SpringBoot");
        userDto.setUser(user);
        return userDto;
    }

    @GetMapping("/listDetails")
    public List<User> listUsers(){
        User user1 = new User("Moisés","Silva");
        User user2 = new User("Patricia","Pallares");
        User user3 = new User("Samanta","Silva");
        User user4 = new User("Zuhelen","Silva");
        
        List<User> users = Arrays.asList(user1,user2,user3,user4);
        // List<User> users = new ArrayList<User>();
        // users.add(user1);
        // users.add(user2);
        // users.add(user3);
        // users.add(user4);
        return users;
        
    }
}
