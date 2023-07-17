package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository propietarioRepository;

	@Override
	public void guardar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(propietario);
	}

	
	
}
