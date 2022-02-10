package com.evaluation.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.app.model.Producto;
import com.evaluation.app.service.OrdenCompraSucursalService;

@RestController
@RequestMapping("/api/ordens")
public class OrdenCompraSucursalController {
  
	@Autowired
	private OrdenCompraSucursalService ordenComprSucursalService;
	
	@PostMapping
	public ResponseEntity<Producto> saveProducto(@RequestBody Producto producto){
		return new ResponseEntity<>(ordenComprSucursalService.saveOrdenCompraSucursal(producto),HttpStatus.CREATED);
	}
	@GetMapping("/listar")
	public List<Producto> listProductos(){
		return ordenComprSucursalService.findAllProducto();
	}
	
}
