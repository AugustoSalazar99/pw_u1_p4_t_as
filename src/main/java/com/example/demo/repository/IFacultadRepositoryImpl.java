package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Facultad;
import com.example.demo.repository.modelo.Universidad;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class IFacultadRepositoryImpl implements IFacultadRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Facultad> seleccionarInnerJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Facultad> myQuery= this.entityManager.createQuery(
				"SELECT f FROM Facultad f JOIN f.universidad u"
				, Facultad.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Facultad> seleccionarOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Facultad> myQuery= this.entityManager.createQuery(
				"SELECT f FROM Facultad f RIGHT JOIN f.universidad u"
				, Facultad.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Facultad> seleccionarOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Facultad> myQuery= this.entityManager.createQuery(
				"SELECT f FROM Facultad f LEFT JOIN f.universidad u"
				, Facultad.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Facultad> seleccionarFacultadOuterFulltJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Facultad> myQuery= this.entityManager.createQuery(
				"SELECT f FROM Facultad f FULL OUTER JOIN f.universidad u"
				, Facultad.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Facultad> seleccionarWhereJoin() {
		// TODO Auto-generated method 
		TypedQuery<Facultad> myQuery= this.entityManager.createQuery(
			"SELECT f FROM Facultad f ,Universidad u WHERE f=u.facultad "
				
				, Facultad.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Universidad> seleccionarUniversidadOuterLeftJoin() {
		// TODO Auto-generated method stub
		
		TypedQuery<Universidad> myQuery=this.entityManager.createQuery(
				"SELECT u FROM Facultad f LEFT JOIN f.universidad u"
				,Universidad.class);
		return myQuery.getResultList();
	}
	
	
	

}
