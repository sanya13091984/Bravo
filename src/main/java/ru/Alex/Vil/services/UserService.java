package ru.Alex.Vil.services;

import org.springframework.stereotype.Service;
import ru.Alex.Vil.services.interfaces.UserInterface;

@Service

public class   UserService implements UserInterface {


    @Override
    public Integer getUser(int x, int y) {
        return x*y;
    }

    @Override
    public Integer postUser(int x, int y) {
        return x+y;
    }

    @Override
    public String putUser(String x, String y) {
        return x+" "+y;
    }

    @Override
    public String delUser() {
        return "просто del";
    }
}
