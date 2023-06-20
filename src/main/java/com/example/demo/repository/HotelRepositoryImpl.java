package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class HotelRepositoryImpl implements HotelRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		Hotel hot= this.buscar(id);
		this.entityManager.remove(hot);
	}

	@Override
	public Hotel buscar(String id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Hotel.class, id);
	}

}
