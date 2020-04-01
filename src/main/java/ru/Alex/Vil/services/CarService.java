package ru.Alex.Vil.services;

import ru.Alex.Vil.models.Car;

public interface CarService {

    Iterable<Car> getCars();

    Car postCar(Car car);

    Car putCar(Car car);

    String delCar(Integer id);
}
