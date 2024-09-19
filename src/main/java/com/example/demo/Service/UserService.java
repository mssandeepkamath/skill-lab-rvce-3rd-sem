package com.example.demo.Service;

import com.example.demo.Model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    ResponseEntity<List<User>> getUsers();

    void registerUser(User user) throws Exception;



}