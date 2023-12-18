package com.anderson.orderControl.controllers;

import com.anderson.orderControl.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Anderson", "anderson@gmail.com", "9999999", "123456");
        return ResponseEntity.ok().body(u);
    }
}
