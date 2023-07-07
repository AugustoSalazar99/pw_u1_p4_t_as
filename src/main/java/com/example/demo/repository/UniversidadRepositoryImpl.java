package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Universidad;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;


@Repository
@Transactional
public class UniversidadRepositoryImpl implements IUniversidadRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Universidad universidad) {
		// TODO Auto-generated method stub
		this.entityManager.persist(universidad);
	}

	@Override
	public void actualizar(Universidad universidad) {
		// TODO Auto-generated method stub
		this.entityManager.merge(universidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Universidad uni=this.buscar(id);
		this.entityManager.remove(uni);
	}

	@Override
	public Universidad buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Universidad.class, id);
	}

	@Override
	public Universidad seleccionarDinamico(String nombre, Double pension) {
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Universidad> myQuery = myBuilder.createQuery(Universidad.class);
		
		Root<Universidad> miTabla=myQuery.from(Universidad.class);
		
		Predicate uNombre=myBuilder.equal(miTabla.get("nombre"), nombre);
		Predicate uPension=myBuilder.equal(miTabla.get("pension"), pension);

		Predicate predicadoFinal=null;
		
		if (pension.compareTo(Double.valueOf(100))<=0) {
			predicadoFinal=myBuilder.or(uNombre,uPension);
		} else {
			predicadoFinal=myBuilder.and(uNombre,uPension);
		}
		
				myQuery.select(miTabla).where(predicadoFinal);
				TypedQuery<Universidad> myQueryFinal = this.entityManager.createQuery(myQuery);
		return myQueryFinal.getSingleResult();
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub

		Query myQuery=this.entityManager.createQuery("DELETE FROM Universidad u WHERE u.nombre=:datoNombre");
		myQuery.setParameter("datoNombre", nombre);
	
		
		return myQuery.executeUpdate();
	}

	@Override
	public int actualizarPorApellido(String nombre, Double pension) {
		// TODO Auto-generated method stub
		return 0;
	}

}
