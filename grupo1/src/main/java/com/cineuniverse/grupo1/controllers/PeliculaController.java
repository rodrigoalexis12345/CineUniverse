package com.cineuniverse.grupo1.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cineuniverse.grupo1.models.Peliculas;
import com.cineuniverse.grupo1.services.PeliculaService;

@Controller //Usamos para renderizar vistas
@RequestMapping("/peliculas")
public class PeliculaController {
    @Autowired 
    private PeliculaService peliculaService;


    @ResponseBody // Usamos este bloque solo para hacer llamadas en json usando postman o en la web
    @GetMapping(path = "/{id}")
    public Optional<Peliculas> getUserById(@PathVariable Long id){
	    return this.peliculaService.getById(id);
    }


    @GetMapping("/listarPeliculas")
    public String ListarPeliculas(Model model) {
        List<Peliculas> peliculas = peliculaService.obtenerPaquetesOrdenados();
        model.addAttribute("peliculas", peliculas);
        return "ListarPeliculas";
    }
}
