/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flutter.backend.digifarmapp.repository;

import com.flutter.backend.digifarmapp.models.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface UserRepository extends JpaRepository<UsersModel, Long>{
    
}
