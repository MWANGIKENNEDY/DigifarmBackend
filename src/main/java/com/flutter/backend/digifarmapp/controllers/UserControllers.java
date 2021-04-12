/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flutter.backend.digifarmapp.controllers;

import com.flutter.backend.digifarmapp.models.UsersModel;
import com.flutter.backend.digifarmapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("/api/v1/")
public class UserControllers {
    
    @Autowired
    UserService userService;
    
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/register/users")
    public UsersModel registerUser(@RequestBody UsersModel usersModel){
        //return a UsersModel object
        return userService.addUser(usersModel);
    }
    
}
