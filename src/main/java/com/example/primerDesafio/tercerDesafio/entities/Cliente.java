package com.example.primerDesafio.tercerDesafio.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	private long id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private LocalDate fechaDeNacimiento;
	private long docIdentidad;
	
	
	public Cliente() {
		
	}
	
	public Cliente(long id, String nombre, String primerApellido, String segundoApellido, LocalDate fechaDeNacimiento,
			long docIdentidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.docIdentidad = docIdentidad;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENTE",precision = 15)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "NOMBRE",nullable = false,length = 50)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name = "PRIMER_APELLIDO",nullable = false,length = 50)
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	
	@Column(name = "SEGUNDO_APELLIDO",nullable = false,length = 50)
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	
	@Column(name = "FECHA_NACIMIENTO",nullable = false)
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	@Column(name = "DOC_IDENTIDAD",unique = true, nullable = false,length = 9)
	public long getDocIdentidad() {
		return docIdentidad;
	}
	public void setDocIdentidad(long docIdentidad) {
		this.docIdentidad = docIdentidad;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", fechaDeNacimiento=" + fechaDeNacimiento + ", docIdentidad=" + docIdentidad + "]";
	}
	
	
}
