package com.ISS.ISS.entities;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Embeddable
public class IssPosition {
    @Column(name = "longitude")
    private String longitude;
    @Column(name = "latitude")
    private String latitude;

}
