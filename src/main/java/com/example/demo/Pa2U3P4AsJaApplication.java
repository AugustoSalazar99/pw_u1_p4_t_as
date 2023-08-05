package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.funcional.Main;
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

	private static final Logger LOG = LoggerFactory.getLogger(Pa2U3P4AsJaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4AsJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("main: " + TransactionSynchronizationManager.isActualTransactionActive());
		
		
		LOG.info("Hilo "+Thread.currentThread().getName());

		/*
		 * //tiempo inicio
		 * 
		 * long tiempoInicial= System.currentTimeMillis();
		 * 
		 * for (int i = 0; i <=100; i++) { CuentaBancaria ctaOrigen = new
		 * CuentaBancaria();
		 * 
		 * ctaOrigen.setNumero(String.valueOf(i));
		 * 
		 * ctaOrigen.setSaldo(new BigDecimal(100));
		 * 
		 * ctaOrigen.setTipo("A");
		 * 
		 * this.cuentaBancariaService.guardar(ctaOrigen);
		 * 
		 * } //tiempo fin long tiempoFinal= System.currentTimeMillis(); long
		 * tiempoTranscurrido=(tiempoFinal-tiempoInicial)/1000;
		 * LOG.info("Tiempo Transcurrido: "+tiempoTranscurrido);
		 * LOG.info("Tiempo Transcurrido: "+(tiempoFinal-tiempoInicial));
		 */
		
		/*
		 * //tiempo inicio
		 * 
		 * long tiempoInicial = System.currentTimeMillis();
		 * 
		 * List<CuentaBancaria> list=new ArrayList<>();
		 * 
		 * for (int i = 1; i <=100; i++) { CuentaBancaria ctaOrigen = new
		 * CuentaBancaria();
		 * 
		 * ctaOrigen.setNumero(String.valueOf(i));
		 * 
		 * ctaOrigen.setSaldo(new BigDecimal(100));
		 * 
		 * ctaOrigen.setTipo("A"); list.add(ctaOrigen); } //
		 * list.stream().forEach(cta->this.cuentaBancariaService.guardar(cta));
		 * list.parallelStream().forEach(cta->this.cuentaBancariaService.guardar(cta));
		 * 
		 * //tiempo fin long tiempoFinal= System.currentTimeMillis(); long
		 * tiempoTranscurrido=(tiempoFinal-tiempoInicial)/1000;
		 * LOG.info("Tiempo Transcurrido: "+tiempoTranscurrido);
		 * LOG.info("Tiempo Transcurrido: "+(tiempoFinal-tiempoInicial));
		 */
        
        
        
		
		//tiempo inicio 
		
		long tiempoInicial = System.currentTimeMillis();
		
		List<CuentaBancaria> list=new ArrayList<>();
        
        for (int i = 1; i <=100; i++) {
    		CuentaBancaria ctaOrigen = new CuentaBancaria();

            ctaOrigen.setNumero(String.valueOf(i));

            ctaOrigen.setSaldo(new BigDecimal(100));

            ctaOrigen.setTipo("A");
            list.add(ctaOrigen);
		}
        //no se ocupa el multihilo
        // list.stream().forEach(cta->this.cuentaBancariaService.guardar(cta));
        //ocupacion del multihilo
        //list.parallelStream().forEach(cta->this.cuentaBancariaService.guardar2(cta));
        
        
        Stream<String> listFinal =list.parallelStream().map(cta->this.cuentaBancariaService.guardar2(cta));
        LOG.info("Se guardaron las siguientes cuentas");
        listFinal.forEach(cadena->LOG.info(cadena));
        
        //tiempo fin
        long tiempoFinal= System.currentTimeMillis();
        long tiempoTranscurrido=(tiempoFinal-tiempoInicial)/1000;
        LOG.info("Tiempo Transcurrido: "+tiempoTranscurrido);
        LOG.info("Tiempo Transcurrido: "+(tiempoFinal-tiempoInicial));
        
        
      
       
        
	
	}
	
	
}
