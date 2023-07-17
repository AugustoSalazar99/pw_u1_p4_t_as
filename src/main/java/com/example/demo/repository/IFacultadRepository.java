package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Facultad;
import com.example.demo.repository.modelo.Universidad;


public interface IFacultadRepository {
	
	public List<Facultad> seleccionarInnerJoin();
	public List<Facultad> seleccionarOuterRightJoin();
	public List<Facultad> seleccionarOuterLeftJoin();
	public List<Facultad> seleccionarFacultadOuterFulltJoin();
	public List<Facultad> seleccionarWhereJoin();
	
	
	public List<Universidad> seleccionarUniversidadOuterLeftJoin();
	
	


}
