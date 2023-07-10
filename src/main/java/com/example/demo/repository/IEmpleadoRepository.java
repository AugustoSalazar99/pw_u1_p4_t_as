package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repository.modelo.Empleado;

public interface IEmpleadoRepository {
	
	public void insertar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public void eliminar(Integer id);
	public Empleado buscar(Integer id);
	
	
	public int eliminarPorId(Integer id);
	public int actualizarPorSueldo(String cargo, BigDecimal sueldo);
	
	public List<Empleado> obtenerPorCargo(String cargo);
	
	

}
