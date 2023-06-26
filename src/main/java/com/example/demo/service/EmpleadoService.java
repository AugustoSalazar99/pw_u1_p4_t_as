package com.example.demo.service;


import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoService {
	public void guardar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public void borrar(String cedula);
	public Empleado buscar(String cedula);

}
