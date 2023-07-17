package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IFacultadRepository;
import com.example.demo.repository.modelo.Facultad;
import com.example.demo.repository.modelo.Universidad;

@Service
public class FacultadServiceImpl implements IFacultadService{

	@Autowired
	private IFacultadRepository facultadRepository;

	@Override
	public List<Facultad> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.facultadRepository.seleccionarInnerJoin();
	}

	@Override
	public List<Facultad> buscarOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.facultadRepository.seleccionarOuterRightJoin();
	}

	@Override
	public List<Facultad> buscarOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.facultadRepository.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Facultad> buscarFacultadOuterFulltJoin() {
		// TODO Auto-generated method stub
		return this.facultadRepository.seleccionarFacultadOuterFulltJoin();
	}

	@Override
	public List<Facultad> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.facultadRepository.seleccionarWhereJoin();
	}

	@Override
	public List<Universidad> buscarUniversidadOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.facultadRepository.seleccionarUniversidadOuterLeftJoin();
	}
	
}
