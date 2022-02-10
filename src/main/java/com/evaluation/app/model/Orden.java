package com.evaluation.app.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordenes")
public class Orden implements Serializable {


	
	private static final long serialVersionUID = 7627072361045501295L;
	@Id
	@Column(name = "orden_id", nullable = false)
	private Integer ordenId;
	@Column(nullable = false)
	private Date fecha;
	@Column(name = "total_decimal", nullable = false)
	private BigDecimal totalDecimal;
	
	//*****
	 Sucursal sucuralId;
//	 @OneToOne(mappedBy = "productoId")
//	 private Producto producto;
//	

	public Integer getOrdenId() {
		return ordenId;
	}

	public void setOrdenId(Integer ordenId) {
		this.ordenId = ordenId;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getTotalDecimal() {
		return totalDecimal;
	}

	public void setTotalDecimal(BigDecimal totalDecimal) {
		this.totalDecimal = totalDecimal;
	}

}
