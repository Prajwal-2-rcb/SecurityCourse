package com.example.securitydemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greetings")
    public String greetings() {
        return "Hello World!";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/greetings/admin")
    public String greetingsAdmin() {
        return "Hello Admin!";
    }

    @PreAuthorize( "hasRole('USER')")
    @GetMapping("/greetings/user")
    public String greetingsUser() {
        return "Hello User!";
    }

}
