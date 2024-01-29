package com.api.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class controller {

    //need 2 end points: register and signup

    @PostMapping("/register")
    public String register() {
        System.out.println("registration complete");
        return "registration complete!";
    }

    @PostMapping("/login")
    public String login(){
        System.out.println("token: ");
        return "token: ";
    }

    @GetMapping("/test")
    public String test() {
        return "server is live...";
    }

}
