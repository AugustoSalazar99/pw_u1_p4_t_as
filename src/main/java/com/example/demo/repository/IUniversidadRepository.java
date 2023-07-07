package com.example.demo.repository;

import com.example.demo.repository.modelo.Universidad;

public interface IUniversidadRepository {
	
	public void insertar(Universidad universidad);
	public void actualizar(Universidad universidad);
	public void eliminar(Integer id);
	public Universidad buscar(Integer id);
	
	///
	
	public Universidad seleccionarDinamico(String nombre,Double pension);
	
	
	
	

}
