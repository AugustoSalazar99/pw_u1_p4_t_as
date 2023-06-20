package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class HabitacionRepositoryImpl  implements HabitacionRepository{

	
	//interpretar con hibernate
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(habitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(habitacion);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		Habitacion hab=this.buscar(id);
		this.entityManager.remove(hab);
	}

	@Override
	public Habitacion buscar(String id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Habitacion.class, id);
	}
	

}
