package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Transferencia;
import com.example.demo.service.ICuentaBancariaService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.ITransferenciaService;

@SpringBootApplication
public class Pa2U3P4AsJaApplication implements CommandLineRunner {
	@Autowired
	private IHotelService hotelService;

	@Autowired
	private IPropietarioService propietarioService;

	@Autowired
	private ITransferenciaService transferenciaService;
	@Autowired
	private ICuentaBancariaService cuentaBancariaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4AsJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("main: " + TransactionSynchronizationManager.isActualTransactionActive());

		/*CuentaBancaria ctaOrigen = new CuentaBancaria();

        ctaOrigen.setNumero("1");

        ctaOrigen.setSaldo(new BigDecimal(100));

        ctaOrigen.setTipo("A");

        this.cuentaBancariaService.guardar(ctaOrigen);

        

 

        CuentaBancaria ctaDestino= new CuentaBancaria();

        ctaDestino.setNumero("2");

        ctaDestino.setSaldo(new BigDecimal(200));

        ctaDestino.setTipo("A");
*/
       // this.cuentaBancariaService.guardar(ctaDestino);
        this.transferenciaService.guardarTransferencia("1", "2", new BigDecimal(10));
	
	}
	
	
}
