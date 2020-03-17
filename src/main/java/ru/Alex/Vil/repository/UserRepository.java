package ru.Alex.Vil.repository;

import org.springframework.data.repository.CrudRepository;
import ru.Alex.Vil.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
