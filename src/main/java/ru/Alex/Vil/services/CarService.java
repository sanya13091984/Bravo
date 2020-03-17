package ru.Alex.Vil.services;
import ru.Alex.Vil.models.Car;


public interface CarService {

    Iterable<Car> getAllCars();

    Car postCar(Car car);

    Car putCar(Car car);

    String putCar(String x, String y);

    String delCar(Integer id);
}
