package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.IEmpleadoRepository;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Universidad;
import com.example.demo.service.IEmpleadoService;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IUniversidadService;

@SpringBootApplication
public class Pa2P4AsTApplication implements CommandLineRunner {

	
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IUniversidadService universidadService;
	@Autowired
	private IEmpleadoService empleadoService;
	
	
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
		
		Estudiante es=new Estudiante();
		es.setNombre("Maria");
		es.setEdad("23");
		es.setEspecialidad("Mecatronica");
		es.setFechaIngreso(LocalDateTime.now());
		
		Empleado em= new Empleado();
		em.setCargo("Inspector");
		em.setSueldo(new BigDecimal(100));
	
	
		
		//this.estudianteService.guardar(es);
		
		Universidad uni = new Universidad();
		/*
		uni.setNombre("uce");
		uni.setUbicación("gasca");
		uni.setFundación("leon mera");
		uni.setPension(200.00);
		*/
		uni.setNombre("ESPE");
		uni.setUbicación("universitaria");
		uni.setFundación("juan mera");
		uni.setPension(400.00);
		
		//
		
		List<Estudiante> listEs= new ArrayList<>();
		listEs.add(es);
		List<Empleado> listEmp= new ArrayList<>();
		listEmp.add(em);
		
		//rela
		
		es.setUniversidad(uni);
		em.setUniversidad(uni);
		uni.setEstudiantes(listEs);
		uni.setEmpleados(listEmp);
		
		//this.universidadService.guardar(uni);
		
		
		//this.empleadoService.guardar(em);
	/*	
	Universidad un=this.universidadService.reporteDinamico("uce",200.00 );
	System.out.println("Nombre de la Universidad: "+un.getNombre()+ " Pension: "+un.getPension());
*/
		
		//this.universidadService.eliminarPorNombre("uce");
		
		
	//this.empleadoService.eliminarPorId(1);
	//System.out.println(this.empleadoService.eliminarPorId(1));
		
		//System.out.println(this.empleadoService.reporteActualizarPorSueldo("Profesor", new BigDecimal(500)));
		
		List<Empleado> reporteEmpl=this.empleadoService.reportePorCargo("Ayudante"); 
		
		for (Empleado empleado : reporteEmpl) {
			System.out.println(empleado.getCargo());
		}
	}

}
