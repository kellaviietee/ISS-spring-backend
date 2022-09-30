package com.ISS.ISS.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "astronauts")
@Data
public class Astronauts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "message")
    private String message;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "astronaut_id", referencedColumnName = "id")
    private List<Person> people;
    @Column(name = "number")
    private int number;
}