package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEmpleadoRepository;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Universidad;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	private IEmpleadoRepository empleadoRepository;

	@Override
	public void guardar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoRepository.insertar(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoRepository.actualizar(empleado);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.empleadoRepository.eliminar(id);
	}

	@Override
	public Empleado reporte(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepository.buscar(id);
	}

	@Override
	public int eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepository.eliminarPorId(id);
	}

	@Override
	public int reporteActualizarPorSueldo(String cargo, BigDecimal sueldo) {
		// TODO Auto-generated method stub
		return this.empleadoRepository.actualizarPorSueldo(cargo, sueldo);
	}

	@Override
	public List<Empleado> reportePorCargo(String cargo) {
		// TODO Auto-generated method stub
		return this.empleadoRepository.obtenerPorCargo(cargo);
	}
	
	
	//join
	
	@Override
	public List<Empleado> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.empleadoRepository.seleccionarInnerJoin();
	}

	@Override
	public List<Empleado> buscarOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.empleadoRepository.seleccionarOuterRightJoin();
	}

	@Override
	public List<Empleado> buscarOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.empleadoRepository.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Empleado> buscarEmpleadoOuterFulltJoin() {
		// TODO Auto-generated method stub
		return this.empleadoRepository.seleccionarEmpleadoOuterFulltJoin();
	}

	@Override
	public List<Empleado> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.empleadoRepository.seleccionarWhereJoin();
	}

	@Override
	public List<Universidad> buscarUniversidadOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.empleadoRepository.seleccionarUniversidadOuterLeftJoin();
	}


	
	
	




}
