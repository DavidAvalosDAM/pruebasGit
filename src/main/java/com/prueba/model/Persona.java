package com.prueba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Persona {
	@Id
	@GeneratedValue
	@Column(name="idpersona")
	private int idPersona;
	
	@Column(name="nombre")
	private String nombre;
	private int edad;
	
	public Persona() {
		super();
	}
	
	public Persona(int idPersona,String nombre, int edad) {
		super();
		this.idPersona=idPersona;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
}
