package com.example.demo.servicios;

import java.util.List;

import com.example.demo.personajes.Peliculas;

public interface ServicePeliculas {
	public List<Peliculas> listadoPeliculas();
	
	public void eliminarPelicula(Peliculas pelicula);
	
	public Peliculas encontrarPelicula (Peliculas pelicula);

	void guardarPelicula(Peliculas pelicula);
}
