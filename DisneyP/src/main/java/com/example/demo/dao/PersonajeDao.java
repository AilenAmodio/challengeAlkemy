package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.personajes.Personaje;

public interface PersonajeDao extends CrudRepository<Personaje, Long> {
	
}
