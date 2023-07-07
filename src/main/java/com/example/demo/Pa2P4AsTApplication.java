package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Universidad;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IUniversidadService;

@SpringBootApplication
public class Pa2P4AsTApplication implements CommandLineRunner {

	
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IUniversidadService universidadService;
	
	
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
		es.setNombre("Pedro");
		es.setEdad("22");
		es.setEspecialidad("filosofia");
		es.setFechaIngreso(LocalDateTime.now());
	
		
		//this.estudianteService.guardar(es);
		
		Universidad uni = new Universidad();
		/*
		uni.setNombre("uce");
		uni.setUbicación("gasca");
		uni.setFundación("leon mera");
		uni.setPension(200.00);
		*/
		uni.setNombre("puce");
		uni.setUbicación("universitaria");
		uni.setFundación("juan mera");
		uni.setPension(200.00);
		
		//
		
		List<Estudiante> listEs= new ArrayList<>();
		listEs.add(es);
		
		
		//rela
		es.setUniversidad(uni);
		uni.setEstudiantes(listEs);
		
		
		//this.universidadService.guardar(uni);
		
	Universidad un=this.universidadService.reporteDinamico("uce",200.00 );
	System.out.println("Nombre de la Universidad: "+un.getNombre()+ " Pension: "+un.getPension());

		
		
	
	}

}
