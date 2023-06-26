package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class ProductoRepositoryImpl implements ProductoRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Producto prod = this.buscar(id);
		this.entityManager.remove(prod);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, id);
	}

	//Query
	@Override
	public Producto seleccionarPorPrecio(BigDecimal precio) {
		
		String jpql="SELECT p FROM Producto p WHERE p.precio= :datoPrecio";
		Query myQuery = this.entityManager.createQuery(jpql);
		myQuery.setParameter("datoPrecio", precio);
		
		return (Producto) myQuery.getSingleResult() ;
	}

	@Override
	public List <Producto> seleccionarPorNombre(String nombre) {
		String jpql="SELECT p FROM Producto p WHERE p.nombre= :datoNombre";
		Query myQuery = this.entityManager.createQuery(jpql);
		myQuery.setParameter("datoNombre", nombre);
		
		return  myQuery.getResultList();
	}

	//TypeQuery
	@Override
	public List<Producto> seleccionarPorPrecioTyped(BigDecimal precio) {
		// TODO Auto-generated method stub
		String jpql="SELECT p FROM Producto p WHERE p.precio= :datoPrecio";
		TypedQuery<Producto> typedQuery = this.entityManager.createQuery(jpql,Producto.class);
		typedQuery.setParameter("datoPrecio", precio);
		
		return  typedQuery.getResultList();
	}

	@Override
	public Producto seleccionarPorNombreyPrecioTyped(String nombre, BigDecimal precio) {
		// TODO Auto-generated method stub
		String jpql="SELECT p FROM Producto p WHERE p.nombre= :datoNombre AND p.precio= :datoPrecio";
		TypedQuery<Producto> typedQuery = this.entityManager.createQuery(jpql,Producto.class);
		typedQuery.setParameter("datoNombre", nombre);
		typedQuery.setParameter("datoPrecio", precio);
	
		return typedQuery.getSingleResult();
	}

}
