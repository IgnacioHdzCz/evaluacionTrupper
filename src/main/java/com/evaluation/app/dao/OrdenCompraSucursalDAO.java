package com.evaluation.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluation.app.model.Producto;

public interface OrdenCompraSucursalDAO extends JpaRepository<Producto, Integer>{

}
