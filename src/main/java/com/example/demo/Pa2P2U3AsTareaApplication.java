package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Transferencia;
import com.example.demo.service.IPropietarioService;

@SpringBootApplication
public class Pa2P2U3AsTareaApplication implements CommandLineRunner {

	@Autowired
	private IPropietarioService propietarioService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2P2U3AsTareaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Propietario p = new Propietario();
		p.setNombre("Rony");
		p.setApellido("Oña");
		p.setCedula("1247568423");
		
		Propietario p1 = new Propietario();
		p1.setNombre("Joel");
		p1.setApellido("Oña");
		p1.setCedula("2147568423");
		
		CuentaBancaria cta=new CuentaBancaria();
		cta.setNumero("22233344");
		cta.setSaldo(new BigDecimal(500));
		cta.setTipo("A");
		//p.getCuentaBancaria().add(cta);
		
		CuentaBancaria cta1=new CuentaBancaria();
		cta1.setNumero("22255544");
		cta1.setSaldo(new BigDecimal(500));
		cta1.setTipo("C");
		//p1.getCuentaBancaria().add(cta1);
		
		Transferencia t = new Transferencia();
		t.setMonton(new BigDecimal(50));
		t.setFecha(LocalDateTime.now());
		t.setCtaOrigen(cta);
		t.setCtaDestino(cta1);
		
		//
		List<CuentaBancaria> listCtaA= new ArrayList<>();
		List<CuentaBancaria> listCtaC= new ArrayList<>();
		listCtaA.add(cta);
		listCtaC.add(cta1);
		
		List<Transferencia> listTA=new ArrayList<>();
		listTA.addAll(cta);
		
		
		p.setCuentaBancaria(listCtaA);
		cta.setTransferenciaOrigen(l);
		t.setCtaOrigen(cta1);
		
		//p1.setCuentaBancaria(listCtaC);
		//t.setCtaOrigen(cta);
		//t.setCtaDestino(cta1);
		
		this.propietarioService.guardar(p);
	
		
		
	
		
	}

}
