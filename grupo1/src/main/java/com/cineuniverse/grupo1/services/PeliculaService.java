package com.cineuniverse.grupo1.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cineuniverse.grupo1.models.Peliculas;
import com.cineuniverse.grupo1.repository.PeliculaRepository;

@Service
public class PeliculaService {
    @Autowired
    PeliculaRepository peliculaRepository;

    public List<Peliculas> obtenerPaquetesOrdenados() {
        return peliculaRepository.findAllByOrderByFechaEstrenoDesc();
    }

    public Optional<Peliculas> getById(Long id){
        return peliculaRepository.findById(id);
    }

    public List<Peliculas> obtenerPeliculasDesdeAnio(int anio) {
        LocalDate inicioAnio = LocalDate.of(anio, 1, 1);
        return peliculaRepository.findByFechaEstrenoGreaterThanEqualOrderByFechaEstrenoAsc(inicioAnio);
    }

    public List<Peliculas> obtenerPeliculasPorCategoria() {
        return peliculaRepository.findByClasificacion("R");
    }
}
