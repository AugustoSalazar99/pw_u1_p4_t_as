package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Facultad;
import com.example.demo.repository.modelo.Universidad;

public interface IFacultadService {
	
	public List<Facultad> buscarInnerJoin();
	public List<Facultad> buscarOuterRightJoin();
	public List<Facultad> buscarOuterLeftJoin();
	public List<Facultad> buscarFacultadOuterFulltJoin();
	public List<Facultad> buscarWhereJoin();
	
	
	public List<Universidad> buscarUniversidadOuterLeftJoin();

}
