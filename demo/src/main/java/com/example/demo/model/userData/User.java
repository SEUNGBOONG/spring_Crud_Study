package com.example.demo.model.userData;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="user")
public class User {

    @Id
    @GeneratedValue
    private Long userId;
    private Long userEmail;
    private Long userJoinDate;
    private Long userPassword;
    private String userName;
}
