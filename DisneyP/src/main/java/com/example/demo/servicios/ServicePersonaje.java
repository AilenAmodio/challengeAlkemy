package com.example.demo.servicios;

import java.util.List;

import com.example.demo.personajes.Personaje;

public interface ServicePersonaje {
	public List<Personaje> listadoPersonajes();
	
	public void guardar (Personaje personaje);
	
	public void eliminar(Personaje personaje);
	
	public Personaje encontrarPersonaje (Personaje personaje);
}
