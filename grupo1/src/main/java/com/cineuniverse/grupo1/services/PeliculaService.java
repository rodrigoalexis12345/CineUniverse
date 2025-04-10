package com.cineuniverse.grupo1.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cineuniverse.grupo1.models.Peliculas;
import com.cineuniverse.grupo1.repository.PeliculaRepository;

@Service
public class PeliculaService {
    @Autowired
    PeliculaRepository peliculaRepository;

    public ArrayList<Peliculas> getPelicula(){
        return (ArrayList<Peliculas>) peliculaRepository.findAll();
    }

    public Peliculas savePelicula(Peliculas pelicula){
        return peliculaRepository.save(pelicula);
    }

    public Optional<Peliculas> getById(Long id){
        return peliculaRepository.findById(id);
    }

    public Peliculas updateById(Peliculas request, Long id){
        Peliculas pelicula = peliculaRepository.findById(id).get();
        
        pelicula.setTitulo(request.getTitulo());
        pelicula.setSinopsis(request.getSinopsis());
        pelicula.setDuracion(request.getDuracion());
        pelicula.setGenero(request.getGenero());
        pelicula.setClasificacion(request.getClasificacion());
        pelicula.setDirector(request.getDirector());
        pelicula.setImagen(request.getImagen());
        pelicula.setFechaEstreno(request.getFechaEstreno());
    
        return pelicula;
    }
    public Boolean deletePelicula (Long id){
        try{
            peliculaRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
