package com.example.demo.service;

import com.example.demo.repository.modelo.Autor;

public interface AutorService {
	public void guardar(Autor autor);
	public void actualizar(Autor autor);
	public void eliminar(Integer id);
	public Autor seleccionar(Integer id);

}
