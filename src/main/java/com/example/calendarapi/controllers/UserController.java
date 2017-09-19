package com.example.calendarapi.controllers;

import com.example.calendarapi.models.User;
import com.example.calendarapi.models.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/creatuser", method = RequestMethod.PUT)
    public User createUser(@ModelAttribute("user") User user)
    {
        try{
            userDao.save(user);
        }
        catch (Exception e){
            return null;
        }
        return user;
    }

}