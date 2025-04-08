package com.cineuniverse.grupo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cineuniverse.grupo1.models.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {
    
    //Buscar un usuario por su email
    java.util.Optional<Usuarios> findByEmail(String email);

    
}
