package com.ISS.ISS.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "iss")
@Data
public class Iss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "iss_position")
    private String issPosition;
    @Column(name = "time_stamp")
    private Long timestamp;
    @Column(name = "message")
    private String message;
}
