package com.evaluation.app.service;

import java.util.List;

import com.evaluation.app.model.Producto;

public interface OrdenCompraSucursalService {
	
	public Producto saveOrdenCompraSucursal(Producto producto);
	public List<Producto> findAllProducto();

}
