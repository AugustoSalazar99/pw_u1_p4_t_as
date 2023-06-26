package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Fabricante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class FabricanteRepositoryImpl implements FabricanteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Fabricante fabricante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(fabricante);

	}

	@Override
	public void actualizar(Fabricante fabricante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(fabricante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Fabricante fab=this.buscar(id);
		this.entityManager.remove(fab);
		
	}

	@Override
	public Fabricante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Fabricante.class, id);
	}

}
