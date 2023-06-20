package com.example.demo.service;

import com.example.demo.repository.modelo.Libro;

public interface LibroService {
	public void guardar(Libro libro);
	public void actulizar(Libro libro);
	public void eliminar(String id);
	public Libro seleccionar(String id);

}
