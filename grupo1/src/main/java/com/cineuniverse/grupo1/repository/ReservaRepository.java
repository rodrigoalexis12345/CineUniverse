package com.cineuniverse.grupo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cineuniverse.grupo1.models.Reservas;

@Repository
public interface ReservaRepository extends JpaRepository<Reservas, Integer>{
    
}
