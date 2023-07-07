package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IUniversidadRepository;
import com.example.demo.repository.modelo.Universidad;

@Service
public class UniversidadServiceImpl implements IUniversidadService {

	
	@Autowired
	private IUniversidadRepository universidadRepository;

	@Override
	public void guardar(Universidad universidad) {
		// TODO Auto-generated method stub
		this.universidadRepository.insertar(universidad);
	}

	@Override
	public void actualizar(Universidad universidad) {
		// TODO Auto-generated method stub
		this.universidadRepository.actualizar(universidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.universidadRepository.eliminar(id);
	}

	@Override
	public Universidad reporte(Integer id) {
		// TODO Auto-generated method stub
		return this.universidadRepository.buscar(id);
	}

	@Override
	public Universidad reporteDinamico(String nombre,Double pension) {
		// TODO Auto-generated method stub
		return this.universidadRepository.seleccionarDinamico(nombre, pension);
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.universidadRepository.eliminarPorNombre(nombre);
	}
}
