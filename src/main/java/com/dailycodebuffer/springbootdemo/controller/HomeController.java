package com.dailycodebuffer.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.springbootdemo.model.User;

@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

    // @RequestMapping(value = "/user", method = RequestMethod.GET)    
    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("John Doe");
        user.setEmailId("john@doe.com");

        return user;
    }

    @GetMapping("/{id}")
    public String pathVariable(@PathVariable String id) {
        return "The path variable is: " + id;
    }

    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name) {
        return "Your name is: " + name;
    }
}
