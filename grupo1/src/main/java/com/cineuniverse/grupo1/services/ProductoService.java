package com.cineuniverse.grupo1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cineuniverse.grupo1.models.Productos;
import com.cineuniverse.grupo1.repository.ProductoRepository;

@Service
public class ProductoService {
        @Autowired
    ProductoRepository productoRepository;

        public List<Productos> obtenerProductosOrdenados() {
        return productoRepository.findAllByOrderByNombreProductoDesc();
    }

    public Optional<Productos> getById(Long id){
        return productoRepository.findById(id);
    }
}
