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
	private String nombreString;
	
	@Column
	private Date fecha_creacionDate;
	
	@Column
	private Date fecha_modificacion;
	
	@Column
	private String descripcionString;

	public Long getId_biblioteca() {
		return id_biblioteca;
	}

	public void setId_biblioteca(Long id_biblioteca) {
		this.id_biblioteca = id_biblioteca;
	}

	public String getNombreString() {
		return nombreString;
	}

	public void setNombreString(String nombreString) {
		this.nombreString = nombreString;
	}

	public Date getFecha_creacionDate() {
		return fecha_creacionDate;
	}

	public void setFecha_creacionDate(Date fecha_creacionDate) {
		this.fecha_creacionDate = fecha_creacionDate;
	}

	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}

	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}

	public String getDescripcionString() {
		return descripcionString;
	}

	public void setDescripcionString(String descripcionString) {
		this.descripcionString = descripcionString;
	}
	
	
	
}
