package com.tester.journalApp.controller;

import com.tester.journalApp.entity.User;
import com.tester.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/public")
@CrossOrigin(origins = "*")
public class PublicController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public void createUser(@RequestBody User user){
        userService.saveNewUser(user);
    }
    @GetMapping("/health-check")
    public String healthCheck(){
        return "Ok";
    }
}
