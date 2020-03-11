package ru.Alex.Vil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.Alex.Vil.services.interfaces.UserInterface;

@RestController
@RequestMapping("/w")

public class UserController {

    @Autowired
    UserInterface userInterface;

    @GetMapping
    Integer get() {
        return userInterface.getUser(5, 10);
    }
    @PostMapping
    Integer post(){
        return userInterface.postUser(100,90);


    }
    @PutMapping
    String put(){
        return userInterface.putUser("добрый","день");
    }
    @DeleteMapping
    String del(){
        return userInterface.delUser();
    }


}
