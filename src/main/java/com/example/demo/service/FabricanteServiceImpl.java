package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.FabricanteRepository;
import com.example.demo.repository.modelo.Fabricante;

@Service

public class FabricanteServiceImpl implements FabricanteService{

	@Autowired
	private FabricanteRepository fabricanteRepository;

	@Override
	public void guarda(Fabricante fabricante) {
		// TODO Auto-generated method stub
		this.fabricanteRepository.insertar(fabricante);
	}

	@Override
	public void actualizar(Fabricante fabricante) {
		// TODO Auto-generated method stub
		this.fabricanteRepository.actualizar(fabricante);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.fabricanteRepository.eliminar(id);
	}

	@Override
	public Fabricante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.fabricanteRepository.buscar(id);
	}
	
	

}
