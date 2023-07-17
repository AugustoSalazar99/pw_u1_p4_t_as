package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Universidad;

public interface IUniversidadRepository {
	
	public void insertar(Universidad universidad);
	public void actualizar(Universidad universidad);
	public void eliminar(Integer id);
	public Universidad buscar(Integer id);
	
	///
	
	public Universidad seleccionarDinamico(String nombre,Double pension);
	
	public int eliminarPorNombre(String nombre);
	
	public int actualizarPorApellido(String nombre,Double pension);
	
	//join
	public List<Universidad> seleccionarInnerJoin();
	public List<Universidad> seleccionarOuterRightJoin();
	public List<Universidad> seleccionarOuterLeftJoin();
	public List<Universidad> seleccionarUniversidadOuterFulltJoin();
	public List<Universidad> seleccionarWhereJoin();
	
	
	
	

}
