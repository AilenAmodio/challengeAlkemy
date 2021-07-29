package com.example.demo.personajes;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="personaje")
public class Personaje implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idpersonaje;
	
	@NotEmpty
	private String Nombre;
	private String Edad;
	private String Peso;
	@NotEmpty
	private String Peliculas;
	
	private String Historia;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEdad() {
		return Edad;
	}
	public void setEdad(String edad) {
		Edad = edad;
	}
	public String getPeso() {
		return Peso;
	}
	public void setPeso(String peso) {
		Peso = peso;
	}
	public String getPeliculas() {
		return Peliculas;
	}
	public void setPeliculas(String peliculas) {
		Peliculas = peliculas;
	}
	public Long getIdpersonaje() {
		return idpersonaje;
	}
	public void setIdpersonaje(Long idpersonaje) {
		this.idpersonaje = idpersonaje;
	}
	public String getHistoria() {
		return Historia;
	}
	public void setHistoria(String historia) {
		Historia = historia;
	}

	
	
}
