package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.support.TransactionSynchronizationManager;

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

		
		System.out.println(TransactionSynchronizationManager.isActualTransactionActive());
		
		
		Propietario prop = new Propietario();
		prop.setNombre("Edison");
		prop.setApellido("Cayambe");
		prop.setCedula("3212");
		
		this.propietarioService.guardar(prop);
	
	
	}

}
