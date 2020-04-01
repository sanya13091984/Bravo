package ru.Alex.Vil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.Alex.Vil.models.Car;
import ru.Alex.Vil.services.Service;

import java.util.List;

@RestController
@RequestMapping("list")
public class GetController {

    @Autowired
    Service service;

    @GetMapping
    public List<Car> xui(){
        return service.getList();
    }










}
