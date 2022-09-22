package com.ISS.ISS.dao;

import com.ISS.ISS.entities.Iss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface issRepository extends JpaRepository<Iss, Integer> {
}
