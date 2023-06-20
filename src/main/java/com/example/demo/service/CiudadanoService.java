package com.example.demo.service;

import com.example.demo.repository.modelo.Ciudadano;

public interface CiudadanoService {

	public void guardar(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public void borrar(Integer id);
	public Ciudadano buscar(Integer id);

}
