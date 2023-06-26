package com.example.demo.service;

import com.example.demo.repository.modelo.Matricula;

public interface MatriculaService {
	public void guardar(Matricula matricula);
	public void actualizar(Matricula matricula);
	public void borrar(String id);
	public Matricula seleccionar(String id);

}
