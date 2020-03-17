package ru.Alex.Vil.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import ru.Alex.Vil.models.User;
import ru.Alex.Vil.services.UserService;

@RestController
@RequestMapping("/u")

public class UserController {


    @Autowired
    UserService userService;

    @GetMapping
    public  Iterable<User> getUsers() {

        return userService.getAllUsers();
    }
    @PostMapping
    User post(User user){
        return userService.postUser(user);


    }
    @PutMapping
    User put(User user) {
        return userService.putUser(user);
    }

        @DeleteMapping
    public String delCar(@RequestParam(name = "id") Integer id){
        return userService.delUser(id);
    }


}
