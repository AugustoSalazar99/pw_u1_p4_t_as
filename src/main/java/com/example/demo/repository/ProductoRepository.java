package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Producto;

public interface ProductoRepository {
	
	public void insertar(Producto producto);
	public void actualizar(Producto producto);
	public void eliminar(Integer id);
	public Producto buscar(Integer id);
	
	
	//Query
	
	public Producto seleccionarPorPrecio(BigDecimal precio);
	public List<Producto> seleccionarPorNombre(String nombre);
	
	//TypeQuery
	public List<Producto> seleccionarPorPrecioTyped(BigDecimal precio);
	public Producto seleccionarPorNombreyPrecioTyped(String nombre,BigDecimal precio);

}
