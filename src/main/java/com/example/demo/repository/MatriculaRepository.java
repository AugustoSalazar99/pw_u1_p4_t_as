package com.example.demo.repository;

import com.example.demo.repository.modelo.Libro;
import com.example.demo.repository.modelo.Matricula;

public interface MatriculaRepository {
	public void insertar(Matricula matricula);
	public void actualizar(Matricula matricula);
	public void eliminar(String id);
	public Matricula buscar(String id);

}
