package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.personajes.Peliculas;

public interface PeliculasDao extends CrudRepository<Peliculas, Long> {

}
