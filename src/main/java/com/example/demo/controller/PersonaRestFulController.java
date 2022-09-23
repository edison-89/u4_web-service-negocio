package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personas")
public class PersonaRestFulController {

	@GetMapping("/{valor}")
	public String consultarPersona(@PathVariable("valor") String valor) {
		String mensaje = "Respuesta Exitosa" + valor;
		return mensaje;
	}
}
