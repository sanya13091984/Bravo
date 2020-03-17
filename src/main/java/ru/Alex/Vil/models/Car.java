package ru.Alex.Vil.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter

@Entity
@Table (name="car")



public class Car {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "marka")
    private String marka;

    @Column(name = "nomer")
    private Integer nomer;


    }

