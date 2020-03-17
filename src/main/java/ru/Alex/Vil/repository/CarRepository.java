package ru.Alex.Vil.repository;

import org.springframework.data.repository.CrudRepository;
import ru.Alex.Vil.models.Car;
import ru.Alex.Vil.models.User;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
