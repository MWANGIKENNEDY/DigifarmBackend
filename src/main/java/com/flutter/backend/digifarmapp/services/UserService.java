/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flutter.backend.digifarmapp.services;

import com.flutter.backend.digifarmapp.models.UsersModel;
import java.util.List;
import java.util.Optional;
/**
 *
 * @author user
 */
public interface UserService {
    public UsersModel addUser(UsersModel usersModel);
    public List<UsersModel> getAllUsers();
    public Optional<UsersModel> getOneUser(Long id);
    public UsersModel updateUser(UsersModel usersModel);
    public void deleteUser(Long id);
}
