package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Producto;

public interface ProductoService {
	public void guardar(Producto producto);
	public void actualizar(Producto producto);
	public void borrar(Integer id);
	public Producto buscar(Integer id);

	//Query
	
	public Producto reportePorPrecio(BigDecimal precio);
	public List <Producto> reportePorNombre(String nombre);
	
	//TypeQuery
	public List <Producto> reportePorPrecioTyped(BigDecimal precio);
	public Producto reportePorNombreyPrecioTyped(String nombre,BigDecimal precio);

	
	
}
