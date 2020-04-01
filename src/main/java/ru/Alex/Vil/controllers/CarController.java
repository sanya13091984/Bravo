package ru.Alex.Vil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.Alex.Vil.models.Car;
import ru.Alex.Vil.services.CarService;


@RestController
@RequestMapping("/cars")


public class CarController {

    @Autowired
    CarService carService;


    @GetMapping
    public Iterable<Car> getCar() {
        return carService.getCars();

    }

    @PostMapping
    public Car postCar(Car car) {
        return carService.postCar(car);
    }


    @PutMapping
    public Car putCar(Car car) {
        return carService.putCar(car);
    }


    @DeleteMapping
    public String delCar(@RequestParam(name = "id") Integer id) {
        return carService.delCar(id);
    }

}
