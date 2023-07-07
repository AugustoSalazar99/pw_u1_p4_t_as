package com.example.demo.service;

import com.example.demo.repository.modelo.Universidad;

public interface IUniversidadService {
	
	public void guardar(Universidad universidad);
	public void actualizar(Universidad universidad);
	public void eliminar(Integer id);
	public Universidad reporte(Integer id);

	public Universidad reporteDinamico(String nombre,Double pension);
	public int eliminarPorNombre(String nombre);


}
