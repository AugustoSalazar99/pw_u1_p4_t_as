package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

public interface EstudianteRepository {
	

	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante); 
	public void eliminar(String cedula);
	public Estudiante buscar(String cedula);
	
	//query
	
	public Estudiante seleccionarPorApellido(String apellido);
	public Estudiante seleccionarPorApellidoTyped(String apellido);

	public List<Estudiante>seleccionarListaPorApellido(String apellido);
	public Estudiante seleccionarPorApellidoyNombre(String apellido,String nombre);

}
