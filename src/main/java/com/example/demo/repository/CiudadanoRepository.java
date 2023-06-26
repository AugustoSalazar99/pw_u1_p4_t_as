package com.example.demo.repository;

import com.example.demo.repository.modelo.Ciudadano;

public interface CiudadanoRepository {
	
		public void insertar(Ciudadano ciudadano);
		public void actualizar(Ciudadano ciudadano);
		public void eliminar(Integer id);
		public Ciudadano buscar(Integer id);
	
	
}
