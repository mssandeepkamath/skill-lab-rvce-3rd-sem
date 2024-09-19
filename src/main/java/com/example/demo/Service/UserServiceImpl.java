package com.example.demo.Service;

import com.example.demo.Model.User;
import org.springframework.http.ResponseEntity;
import java.util.List;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public ResponseEntity<List<User>> getUsers() {
        try {
            List<User> users = userDao.findAll();
            System.out.println(users);
            return new ResponseEntity<List<User>>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
    }
    @Override
    public void registerUser(User user) throws Exception {

            User existingUser = userDao.findByUserName(user.getUserName());
            if(existingUser == null)
                userDao.save(user);
            else
                throw new Exception();


    }
}