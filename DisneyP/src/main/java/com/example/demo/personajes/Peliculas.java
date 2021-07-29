package com.example.demo.personajes;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="peliculas")
public class Peliculas implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpeliculas;
	private String Titulo;
	private String Fecha;
	private String Calificacion;
	private String Personajes;
	
	public Long getIdpeliculas() {
		return idpeliculas;
	}
	public void setIdpeliculas(Long idpeliculas) {
		this.idpeliculas = idpeliculas;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public String getCalificacion() {
		return Calificacion;
	}
	public void setCalificacion(String calificacion) {
		Calificacion = calificacion;
	}
	public String getPersonajes() {
		return Personajes;
	}
	public void setPersonajes(String personajes) {
		Personajes = personajes;
	}
	
	
	
}
