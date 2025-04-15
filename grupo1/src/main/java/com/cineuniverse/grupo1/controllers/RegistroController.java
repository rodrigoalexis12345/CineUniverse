package com.cineuniverse.grupo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RegistroController {
	
	@GetMapping("/registroUsuario")
	public String iniciarSesion() {
		return "RegistroUsuario";
	}
	
}
