package ru.Alex.Vil.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "a_user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)


    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "pass")
    private Integer pass;

}



