package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(propietario);
	}

}
