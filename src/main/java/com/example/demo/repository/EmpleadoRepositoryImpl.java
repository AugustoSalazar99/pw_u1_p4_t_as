package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class EmpleadoRepositoryImpl implements IEmpleadoRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.merge(empleado);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Empleado em=this.buscar(id);
		this.entityManager.remove(em);
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public int eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		
		Query myQuery=this.entityManager.createQuery("DELETE FROM Empleado e WHERE e.id=:datoId");
		myQuery.setParameter("datoId", id);
		
		return myQuery.executeUpdate();
	}

	@Override
	public int actualizarPorSueldo(String cargo, BigDecimal sueldo) {
		// TODO Auto-generated method stub
		
		Query myQuery=this.entityManager.createQuery("UPDATE Empleado e SET e.cargo=:datoCargo WHERE e.sueldo=:datoSueldo");
		myQuery.setParameter("datoCargo", cargo);
		myQuery.setParameter("datoSueldo", sueldo);

		return myQuery.executeUpdate();
	}

	@Override
	public List<Empleado> obtenerPorCargo(String cargo) {
		// TODO Auto-generated method stub
		TypedQuery<Empleado> myQuery=this.entityManager.createQuery(
				"SELECT  e FROM Empleado e WHERE e.cargo=: datoCargo"
				,Empleado.class);
		myQuery.setParameter("datoCargo", cargo);
		
		
		return myQuery.getResultList();
	}

}
