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

import com.cineuniverse.grupo1.models.Productos;
import com.cineuniverse.grupo1.services.ProductoService;

@Controller
@RequestMapping("/dulceria")
public class DulceriaController {
	
    @Autowired 
    private ProductoService productoService;


	@ResponseBody
    @GetMapping(path = "/{id}")
    public Optional<Productos> getUserById(@PathVariable Long id){
	    return this.productoService.getById(id);
    }

    @GetMapping("/listarProductos")
    public String ListarProductos(Model model) {
        List<Productos> productos = productoService.obtenerProductosOrdenados();
        model.addAttribute("productos", productos);
        return "Dulceria";
    }

}
