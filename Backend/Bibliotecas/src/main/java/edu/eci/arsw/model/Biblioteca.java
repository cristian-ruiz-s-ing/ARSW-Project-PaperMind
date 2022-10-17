package edu.eci.arsw.model;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Una entidad es un objeto, elemento o ‘cosa’ con atributos particulares que lo distinguen. Por ejemplo, este podría ser un ‘user
public class Biblioteca {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)//El valor de esta PK es generada automáticamente con esta anotación
	private Long id_biblioteca;
	
	@Column
	private String nombre;
	
	@Column
	private Date fecha_creacion;
	
	@Column
	private Date fecha_modificacion;
	
	@Column
	private String descripcion;

	public Long getId_biblioteca() {
		return id_biblioteca;
	}

	public void setId_biblioteca(Long id_biblioteca) {
		this.id_biblioteca = id_biblioteca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}

	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
