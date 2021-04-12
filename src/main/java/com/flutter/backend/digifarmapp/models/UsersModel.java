/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flutter.backend.digifarmapp.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author user
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@ToString
@Entity
@Table(name = "users")
public class UsersModel implements Serializable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String userEmail;
    private String userName;
    private String password;   
}
