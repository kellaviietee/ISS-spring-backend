package com.ISS.ISS.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AstronautsRepository extends JpaRepository<Astronauts, Integer> {
}
