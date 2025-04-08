package com.cineuniverse.grupo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cineuniverse.grupo1.models.Funciones;

@Repository
public interface FuncionRepository extends JpaRepository<Funciones, Integer>{
    
}
