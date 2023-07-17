package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICuentaBancariaRepository;
import com.example.demo.repository.ITransferenciaRepository;
import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{

	
	@Autowired
	private ITransferenciaRepository transferenciaRepository;

	@Autowired
	private ICuentaBancariaRepository cuentaBancariaRepository;
	@Override
	public void guardarTransferencia(Integer ctaIdOrigen,Integer ctaIdDestino,BigDecimal monto) {
		// TODO Auto-generated method stub
		
		CuentaBancaria ctaOrigen = this.cuentaBancariaRepository.selecionar(ctaIdOrigen);
		BigDecimal saldoOrigen = ctaOrigen.getSaldo();
		
		BigDecimal montoDebitar= monto;
		
		if (montoDebitar.compareTo(saldoOrigen)<=0) {
			BigDecimal nuevoSaldoOrigen =saldoOrigen.subtract(montoDebitar);
			ctaOrigen.setSaldo(nuevoSaldoOrigen);
			this.cuentaBancariaRepository.actualizar(ctaOrigen);
			
			CuentaBancaria ctaDestino =this.cuentaBancariaRepository.selecionar(ctaIdDestino);
			BigDecimal saldoDestino=ctaDestino.getSaldo();
			BigDecimal nuevoSaldoDestino = saldoDestino.add(montoDebitar);
			ctaDestino.setSaldo(nuevoSaldoDestino);
			this.cuentaBancariaRepository.actualizar(ctaDestino);
			
			Transferencia t=new Transferencia();
			t.setCtaOrigen(ctaOrigen);
			t.setCtaDestino(ctaDestino);
			t.setMonton(monto);
			t.setFecha(LocalDateTime.now());
			this.transferenciaRepository.insertar(t);;
			
			
			
			
		} else {

			System.out.println("No hay ");
		}
		
		
		
		
		
	}

	@Override
	public void guardar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.insertar(transferencia);
		
	}

	@Override
	public List<Transferencia> reporteCta() {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.seleccionarCta();
	}

	

	
	
}
