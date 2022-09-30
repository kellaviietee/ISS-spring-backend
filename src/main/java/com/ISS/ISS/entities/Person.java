package com.ISS.ISS.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "astronaut")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "craft")
    private String craft;
    @Column(name = "name")
    private String name;
}