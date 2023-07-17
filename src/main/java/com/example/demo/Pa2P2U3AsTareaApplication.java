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
import com.example.demo.service.ICuentaBancariaService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.ITransferenciaService;

@SpringBootApplication
public class Pa2P2U3AsTareaApplication implements CommandLineRunner {

	@Autowired
	private IPropietarioService propietarioService;
	
	@Autowired
	private ITransferenciaService transferenciaService;
	@Autowired
	private ICuentaBancariaService cuentaBancariaService;
	
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
		
		Propietario p2 = new Propietario();
		p2.setNombre("Luis");
		p2.setApellido("Oña");
		p2.setCedula("1732125423");
		
		CuentaBancaria cta=new CuentaBancaria();
		cta.setNumero("22233344");
		cta.setSaldo(new BigDecimal(300));
		cta.setTipo("A");
		
		
		CuentaBancaria cta1=new CuentaBancaria();
		cta1.setNumero("22255544");
		cta1.setSaldo(new BigDecimal(500));
		cta1.setTipo("C");
		
		CuentaBancaria cta2=new CuentaBancaria();
		cta2.setNumero("22233355");
		cta2.setSaldo(new BigDecimal(800));
		cta2.setTipo("C");
		

		//
		List<CuentaBancaria> listCtaA= new ArrayList<>();
		List<CuentaBancaria> listCtaC= new ArrayList<>();
		listCtaA.add(cta);
		listCtaC.add(cta2);
		
		
		
		
		cta2.setPropietario(p2);
		p2.setCuentaBancaria(listCtaC);
		
		//this.propietarioService.guardar(p);
		//this.propietarioService.guardar(p1);
		//this.propietarioService.guardar(p2);
	
		
		
	
	
		//this.transferenciaService.guardarTransferencia(8, 9, new BigDecimal(100));
	
		
		List<Transferencia> transferencia =this.transferenciaService.reporteCta();

		for (Transferencia t :transferencia) {
			System.out.println(
					"Transferencia ID: "+t.getId()
					+" Monton:"+t.getMonton()
					+" Fecha: "+t.getFecha()	);
			
		}
	
	
	}

}
