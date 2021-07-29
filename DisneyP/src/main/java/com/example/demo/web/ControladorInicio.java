package com.example.demo.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.personajes.Personaje;
import com.example.demo.servicios.ServicePersonaje;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {
	
	@Autowired
	private ServicePersonaje servicePersonaje;
	
	@GetMapping("/")
	public String inicio (Model model) {
		Iterable<Personaje> personajes = servicePersonaje.listadoPersonajes();
		model.addAttribute("personajes", personajes);
		return "index";
	}
	
	@GetMapping("/agregar")
	public String agregar(Personaje personaje) {
		return "modificar";
	}
	
	@PostMapping("/guardar")
	public String guardar(@Valid Personaje personaje, Errors errores) {
		if(errores.hasErrors()) {
			return "modificar";
		}
		servicePersonaje.guardar(personaje);
		return "redirect:/";
	}
	
	@GetMapping("/editar/{idpersonaje}")
	public String editar(Personaje personaje, Model model) {
		personaje = servicePersonaje.encontrarPersonaje(personaje);
		model.addAttribute("personaje", personaje);
		return "modificar";
	}
	
	@GetMapping("/eliminar/{idpersonaje}")
	public String eliminar(Personaje personaje) {
		servicePersonaje.eliminar(personaje);
		return "redirect:/";
	}
}