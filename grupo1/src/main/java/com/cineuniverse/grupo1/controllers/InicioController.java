package com.cineuniverse.grupo1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cineuniverse.grupo1.models.Peliculas;
import com.cineuniverse.grupo1.services.PeliculaService;

@Controller
public class InicioController {

	@Autowired
    private PeliculaService peliculaService;
	
    @GetMapping("/home")
    public String mostrarPaginaInicio(Model model) {
            // Obtener películas del año 2026 en adelante
			List<Peliculas> proximosEstrenos = peliculaService.obtenerPeliculasDesdeAnio(2026);
			model.addAttribute("proximosEstrenos", proximosEstrenos);

			// Obtener películas através de su clasificación "R"
			List<Peliculas> clasificacionR = peliculaService.obtenerPeliculasPorCategoria();
			model.addAttribute("clasificacionR", clasificacionR);

			return "Index";
    }
}
