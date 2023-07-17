package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Universidad;

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

	//join
	
	
	@Override
	public List<Empleado> seleccionarInnerJoin() {
		/*
		 * select e.empl_cargo,un.univ_nombre from empleado e inner join
			universidad un on un.univ_id = e.universidad_id
		 * */
		TypedQuery<Empleado> myQuery = this.entityManager.createQuery(
				"SELECT e  from  Empleado e JOIN e.universidad u "
				,Empleado.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Empleado> seleccionarOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Empleado> myQuery=this.entityManager.createQuery(
				"SELECT e FROM Empleado e RIGHT JOIN e.universidad u",
				Empleado.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Empleado> seleccionarOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Empleado> myqQuery=this.entityManager.createQuery(
				"SELECT e FROM Empleado e LEFT JOIN e.universidad u",
				Empleado.class);
		
		return myqQuery.getResultList();
	}

	@Override
	public List<Empleado> seleccionarEmpleadoOuterFulltJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Empleado> myQuery=this.entityManager.createQuery(
				"SELECT e FROM Empleado e FULL OUTER JOIN e.universidad u"
				,Empleado.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Empleado> seleccionarWhereJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Empleado> myQuery=this.entityManager.createQuery(
				//"SELECT e FROM Empleado e,Universidad u WHERE e=u.empleado"
		      //  "SELECT e FROM Empleado e , Universidad u WHERE e=u.empleado ON e.empl_id=u.univ_id"
				"SELECT e FROM Empleado e, Universidad u WHERE e = u.empleado"
				,Empleado.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Universidad> seleccionarUniversidadOuterLeftJoin() {
		
		TypedQuery<Universidad> myQuery=this.entityManager.createQuery(
				"SELECT u FROM Empleado e LEFT JOIN e.universidad u"
				,Universidad.class);
		return myQuery.getResultList();
	}
	
	
	

}
