package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Empleado;

public interface IEmpleadoService {

	
	public void guardar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public void eliminar(Integer id);
	public Empleado reporte(Integer id);
	
	public int eliminarPorId(Integer id);
	public int reporteActualizarPorSueldo(String cargo, BigDecimal sueldo);

	
	public List<Empleado> reportePorCargo(String cargo);

	
	
}
