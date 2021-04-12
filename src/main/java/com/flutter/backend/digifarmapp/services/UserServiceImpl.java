/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flutter.backend.digifarmapp.services;

import com.flutter.backend.digifarmapp.models.UsersModel;
import com.flutter.backend.digifarmapp.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author user
 */
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UsersModel> getAllUsers() {
        return userRepository.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<UsersModel> getOneUser(Long id) {
        return userRepository.findById(id);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsersModel addUser(UsersModel usersModel) {
        return userRepository.save(usersModel); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsersModel updateUser(UsersModel usersModel) {
        return userRepository.save(usersModel);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    
}
