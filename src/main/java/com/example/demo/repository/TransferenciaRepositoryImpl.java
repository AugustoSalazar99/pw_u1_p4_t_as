package com.example.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.CuentaBancaria;

import com.example.demo.repository.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public void insertar(Transferencia transferencia) {
		this.entityManager.persist(transferencia);
	}

	@Override
	public List<Transferencia > seleccionarCta() {
		// TODO Auto-generated method stub
		TypedQuery<Transferencia > myQuery=this.entityManager.createQuery(
				"SELECT t FROM Transferencia t "
				, Transferencia .class);
		return myQuery.getResultList();
	}

	
	

	
		
		
	}

	


	

