package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public CuentaBancaria buscar(Integer id);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public List<CuentaBancaria> reporteCta();

}
