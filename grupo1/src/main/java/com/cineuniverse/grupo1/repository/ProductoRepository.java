package com.cineuniverse.grupo1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cineuniverse.grupo1.models.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos,Long>{
    List<Productos> findAllByOrderByNombreProductoDesc();
}
