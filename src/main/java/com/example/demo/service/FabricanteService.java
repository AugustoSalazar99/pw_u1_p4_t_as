package com.example.demo.service;

import com.example.demo.repository.modelo.Fabricante;

public interface FabricanteService {
	
	public void guarda(Fabricante fabricante);
	public void actualizar(Fabricante fabricante);
	public void borrar(Integer id);
	public Fabricante buscar(Integer id);

}
