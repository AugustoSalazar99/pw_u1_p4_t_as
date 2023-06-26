package com.example.demo.repository;

import com.example.demo.repository.modelo.Materia;

public interface MateriaRepository {

	public void insertar(Materia materia);
	public void actualizar(Materia materia);
	public void eliminar(String id);
	public Materia buscar(String id);
}
