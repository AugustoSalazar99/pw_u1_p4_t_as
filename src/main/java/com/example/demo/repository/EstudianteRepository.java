package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

public interface EstudianteRepository {
	

	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante); 
	public void eliminar(String cedula);
	public Estudiante buscar(String cedula);
	

}
