package com.evaluation.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evaluation.app.dao.OrdenCompraSucursalDAO;
import com.evaluation.app.model.Producto;

@Service
public class OrdenCompraSucursalServiceImpl implements OrdenCompraSucursalService {

	@Autowired
	OrdenCompraSucursalDAO ordenCompraSucursalDAO;
	
	@Override
	public Producto saveOrdenCompraSucursal(Producto producto) {
		Producto productoDTO = new Producto();
		productoDTO.setCodigo(producto.getCodigo());
		productoDTO.setDescripcion(producto.getDescripcion());
		productoDTO.setPrecio(producto.getPrecio());
		//productoDTO.setOrdenId(producto.getOrdenId());
		Producto newProducto = ordenCompraSucursalDAO.save(productoDTO);		
		return newProducto;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAllProducto() {
		List<Producto> listProducto = ordenCompraSucursalDAO.findAll();
		return listProducto;
	}

}
