package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class LibroRepositoryImpl  implements LibroRepository{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(libro);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		Libro lib= this.buscar(id);
		this.entityManager.remove(lib);
	}

	@Override
	public Libro buscar(String id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Libro.class, id);
	}
	

}
