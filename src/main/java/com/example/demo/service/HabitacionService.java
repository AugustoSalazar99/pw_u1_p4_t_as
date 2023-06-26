package com.example.demo.service;

import com.example.demo.repository.modelo.Habitacion;

public interface HabitacionService {
	public void insertar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public void eliminar(String id);
	public Habitacion buscar(String id);
	

}
