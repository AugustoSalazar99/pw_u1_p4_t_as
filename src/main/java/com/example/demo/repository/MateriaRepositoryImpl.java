package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class MateriaRepositoryImpl implements MateriaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(materia);
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(materia);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}

	@Override
	public Materia buscar(String id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Materia.class, id);
	}

}
