package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AlumnoRepository;
import com.example.demo.repository.modelo.Alumno;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoRepository alumnoRepository;
	@Override
	public void insertar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.alumnoRepository.insertar(alumno);
	}

	@Override
	public void actualizar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.alumnoRepository.actualizar(alumno);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.alumnoRepository.eliminar(id);
	}

	@Override
	public Alumno buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.alumnoRepository.buscar(id);
	}

}
