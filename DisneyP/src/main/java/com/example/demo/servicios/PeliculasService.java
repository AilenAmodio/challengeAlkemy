package com.example.demo.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.PeliculasDao;
import com.example.demo.dao.PersonajeDao;
import com.example.demo.personajes.Peliculas;
import com.example.demo.personajes.Personaje;

@Service
public class PeliculasService implements ServicePeliculas{
	
	@Autowired
	private PeliculasDao peliculaDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Peliculas> listadoPeliculas() {
		return (List<Peliculas>)peliculaDao.findAll();
	}
	
	@Override
	@Transactional
	public void guardarPelicula (Peliculas pelicula) {
		peliculaDao.save(pelicula);
		
	}
	
	@Override
	@Transactional
	public void eliminarPelicula(Peliculas pelicula) {
		peliculaDao.delete(pelicula);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Peliculas encontrarPelicula(Peliculas pelicula) {
		return peliculaDao.findById(pelicula.getIdpeliculas()).orElse(null);
	}




}
