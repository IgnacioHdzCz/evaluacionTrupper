package com.evaluation.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sucursales")
public class Sucursal implements Serializable{
	
	
	private static final long serialVersionUID = -7840586540475351135L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sucursal_id",nullable = false)
	private Integer sucursalId;
	@Column(name = "nombre", length = 50, nullable = false )
	private String nombre;
	

	public Integer getSucursalId() {
		return sucursalId;
	}
	public void setSucursalId(Integer sucursalId) {
		this.sucursalId = sucursalId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
