package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.IFacultadRepository;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Facultad;
import com.example.demo.repository.modelo.Universidad;
import com.example.demo.service.IEmpleadoService;
import com.example.demo.service.IFacultadService;
import com.example.demo.service.IUniversidadService;


@SpringBootApplication
public class Pa2P4AsTApplication implements CommandLineRunner {

	

	@Autowired
	private IEmpleadoService empleadoService;
	@Autowired
	private IUniversidadService universidadService;
	@Autowired
	private IFacultadService facultadService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2P4AsTApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		///TAREA
		///TAREA
		///TAREA
		///TAREA
		///TAREA
		

		
	/*	
		List<Empleado> listempl =this.empleadoService.buscarOuterRightJoin();
		for (Empleado e : listempl) {
			if (e==null) {
				System.out.println("No existe");
			} else {
				System.out.println(e.getCargo());
			}
			
			
		}
		*/
		

		/*
		List<Empleado> listempl2 =this.empleadoService.buscarOuterLeftJoin();
		for (Empleado e : listempl2) {
			if (e==null) {
				System.out.println("No existe");
			} else {
				System.out.println(e.getCargo());
			}
			
			
		}
		*/
		/*
		List<Empleado> listempl3 =this.empleadoService.buscarEmpleadoOuterFulltJoin();
		for (Empleado empleado : listempl3) {
			if (empleado==null) {
				System.out.println("No existe");
			}else {
			System.out.println(empleado.getCargo());
			}
		}
	*/
		
		/*
		
		List<Empleado> listempl4 =this.empleadoService.buscarWhereJoin();
		
		for (Empleado empleado : listempl4) {
			
			
			
			if (empleado==null) {
				System.out.println("No existe");
			} else {
				System.out.println(empleado.getCargo());
			}
			
		}
			
		*/
		
		/*
		List<Facultad> listFac=this.facultadService.buscarWhereJoin();
		for (Facultad facultad : listFac) {
			if(facultad==null) {
			System.out.println("No existe");
				
			}else {
			System.out.println(facultad.getNombre());
		}
		
		*/
		/*
		List<Empleado> listempl4 =this.empleadoService.buscarWhereJoin();
		for (Empleado e : listempl4) {
			if (e==null) {
				System.out.println("No existe");
			} else {
				System.out.println(e.getCargo());
			}
			
			
		}
		*/
		
		/*
		List<Universidad> listempl4 =this.empleadoService.buscarUniversidadOuterLeftJoin();
		for (Universidad universidad : listempl4) {
			System.out.println(listempl4);
		}
		*/
		
		List<Universidad> listempl4 =this.facultadService.buscarUniversidadOuterLeftJoin();
		for (Universidad universidad : listempl4) {
			System.out.println(listempl4);
		}
		
		
	}


		
	}
	

