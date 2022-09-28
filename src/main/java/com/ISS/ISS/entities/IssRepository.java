package com.ISS.ISS.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssRepository extends JpaRepository<Iss, Integer> {
}
