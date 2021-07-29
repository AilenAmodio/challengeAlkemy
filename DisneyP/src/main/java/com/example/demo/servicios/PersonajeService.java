package com.example.demo.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.PersonajeDao;
import com.example.demo.personajes.Personaje;

@Service
public class PersonajeService implements com.example.demo.servicios.ServicePersonaje {
	
	@Autowired
	private PersonajeDao personajeDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Personaje> listadoPersonajes() {
		return (List<Personaje>)personajeDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Personaje personaje) {
		personajeDao.save(personaje);
		
	}

	@Override
	@Transactional
	public void eliminar(Personaje personaje) {
		personajeDao.delete(personaje);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Personaje encontrarPersonaje(Personaje personaje) {
		return personajeDao.findById(personaje.getIdpersonaje()).orElse(null);
	}


}
