package com.example.demo.repository;

import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Fabricante;

public interface FabricanteRepository {
	public void insertar(Fabricante fabricante);
	public void actualizar(Fabricante fabricante);
	public void eliminar(Integer id);
	public Fabricante buscar(Integer id);
}
