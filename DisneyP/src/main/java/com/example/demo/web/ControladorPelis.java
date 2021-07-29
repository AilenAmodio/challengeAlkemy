package com.example.demo.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.personajes.Peliculas;
import com.example.demo.personajes.Personaje;
import com.example.demo.servicios.ServicePeliculas;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorPelis {
	@Autowired
	ServicePeliculas servicePeli;
	
	@GetMapping("/peliculas")
	public String inicio (Model model) {
		Iterable<Peliculas> peliculas = servicePeli.listadoPeliculas();
		model.addAttribute("peliculas", peliculas);
		return "/peliculas";
	}
	
	@GetMapping("/modpelis")
	public String agregarPelicula(Peliculas pelicula) {
		return "modpelis";
	}
	
	@PostMapping("/guardarPelicula")
	public String guardarPelicula(@Valid Peliculas pelicula, Errors errores) {
		if(errores.hasErrors()) {
			return "modpelis";
		}
		servicePeli.guardarPelicula(pelicula);
		return "redirect:/";
	}
	
	@GetMapping("/editarPelicula/{idpeliculas}")
	public String editarPelicula(Peliculas pelicula, Model model) {
		pelicula = servicePeli.encontrarPelicula(pelicula);
		model.addAttribute("peliculas", pelicula);
		return "modpelis";
	}
	
	@GetMapping("/eliminarPelicula/{idpeliculas}")
	public String eliminarPelicula(Peliculas pelicula) {
		servicePeli.eliminarPelicula(pelicula);
		return "redirect:/";
	}
}
