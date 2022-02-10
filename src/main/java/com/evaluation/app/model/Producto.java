package com.evaluation.app.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	private static final long serialVersionUID = -5200196612811821907L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "producto_id", nullable = false)
	private Integer productoId;
	@Column(name = "codigo", length = 20, nullable = false)
	private String codigo;
	@Column(name = "descripcion", length = 200, nullable = false)
	private String descripcion;
	@Column(name = "precio", nullable = false)
	private BigDecimal precio;

	// *****
//	@ManyToOne
//	@JoinColumn(name = "orden_id", referencedColumnName = "ordenId")
//	Orden ordenId;
//
//	public Orden getOrdenId() {
//		return ordenId;
//	}
//
//	public void setOrdenId(Orden ordenId) {
//		this.ordenId = ordenId;
//	}

	public Integer getProductoId() {
		return productoId;
	}

	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	
	
}
