package com.cineuniverse.grupo1.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cineuniverse.grupo1.models.Peliculas;
import com.cineuniverse.grupo1.services.PeliculaService;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
    @Autowired 
    private PeliculaService peliculaService;

    @GetMapping

    public ArrayList<Peliculas> getPeliculas(){
	    return this.peliculaService.getPelicula();
    }

    @PostMapping
    public Peliculas savePelicula(@RequestBody Peliculas pelicula){
	return this.peliculaService.savePelicula(pelicula);
    }

    @GetMapping(path = "/{id}")
    public Optional<Peliculas> getUserById(@PathVariable Long id){
	    return this.peliculaService.getById(id);
    }
    
    @PutMapping(path = "/{id}")
    public Peliculas updateUserById(@RequestBody Peliculas request, Long id){
	return this.peliculaService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
	boolean ok = this.peliculaService.deletePelicula(id);

	if(ok){
		return "Usuario con id "+id+ " deleted!";
	}else {
		return "Error, tenemos un problema, no podemos eliminar el id "+id;
	}
}
}
