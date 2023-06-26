package com.example.demo.service;

import com.example.demo.repository.modelo.Alumno;

public interface AlumnoService {
	public void insertar(Alumno alumno);
	public void actualizar(Alumno alumno);
	public void eliminar(Integer id);
	public Alumno buscar(Integer id);

}
