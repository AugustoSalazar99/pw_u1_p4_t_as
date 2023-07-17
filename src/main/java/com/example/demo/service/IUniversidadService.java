package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Universidad;

public interface IUniversidadService {
	
	public void guardar(Universidad universidad);
	public void actualizar(Universidad universidad);
	public void eliminar(Integer id);
	public Universidad reporte(Integer id);

	public Universidad reporteDinamico(String nombre,Double pension);
	public int eliminarPorNombre(String nombre);
	
	//join
	public List<Universidad> buscarInnerJoin();
	public List<Universidad> buscarOuterRightJoin();
	public List<Universidad> buscarOuterLeftJoin();
	public List<Universidad> buscarUniversidadOuterFulltJoin();
	public List<Universidad> buscarWhereJoin();


}
