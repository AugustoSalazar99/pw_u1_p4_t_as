package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Universidad;

public interface IEmpleadoService {

	
	public void guardar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public void eliminar(Integer id);
	public Empleado reporte(Integer id);
	
	public int eliminarPorId(Integer id);
	public int reporteActualizarPorSueldo(String cargo, BigDecimal sueldo);

	
	public List<Empleado> reportePorCargo(String cargo);

	//join
	public List<Empleado> buscarInnerJoin();
	public List<Empleado> buscarOuterRightJoin();
	public List<Empleado> buscarOuterLeftJoin();
	public List<Empleado> buscarEmpleadoOuterFulltJoin();
	public List<Empleado> buscarWhereJoin();
	
	
	public List<Universidad> buscarUniversidadOuterLeftJoin();

}
