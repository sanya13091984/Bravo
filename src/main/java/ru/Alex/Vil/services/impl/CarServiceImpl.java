package ru.Alex.Vil.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.Alex.Vil.models.Car;
import ru.Alex.Vil.repository.CarRepository;
import ru.Alex.Vil.services.CarService;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car postCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car putCar(Car car) {
        return null;
    }


    @Override
    public String delCar(Integer id) {
        carRepository.deleteById(id);
        return "delete user №" + id;


    }
}