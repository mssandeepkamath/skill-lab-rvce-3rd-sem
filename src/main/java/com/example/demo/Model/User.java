package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class User {

    @Column(name = "userName", nullable = false)
    @JsonProperty("userName")
    private String userName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public String getUserName() {
        return userName;
    }

    public User(String userName) {
        this.userName = userName;
    }
    // No-args constructor
    public User() {
    }

}