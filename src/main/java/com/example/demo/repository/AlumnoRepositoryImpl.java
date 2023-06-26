package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class AlumnoRepositoryImpl implements AlumnoRepository {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.entityManager.persist(alumno);
	}

	@Override
	public void actualizar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.entityManager.merge(alumno);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Alumno buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Alumno.class, id);
	}

}
