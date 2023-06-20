package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.AutorService;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;
import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.AutorRepository;
import com.example.demo.repository.modelo.Autor;

@SpringBootApplication
public class Pa2U2P4AsJaApplication implements CommandLineRunner {

	@Autowired
	private CiudadanoService ciudadanoService;
	@Autowired
	private EmpleadoService empleadoService;
	@Autowired
	private HotelService hotelService;
	@Autowired
	private HabitacionService habitacionService;
	@Autowired
	private AutorRepository autorRepository;
	@Autowired
	private AutorService autorService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AsJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Autor aut = new Autor();
		aut.setNombre("Miguel");
		aut.setApellido("De Cervantes");
		
		Autor aut1 = new Autor();
		aut1.setNombre("Victor");
		aut1.setApellido("Hugo");
		
		Libro lib=new Libro();
		lib.setTitulo("La odisea");
		lib.setEditorial("Pearson");
		
		Libro lib1=new Libro();
		lib1.setTitulo("Pato Lee");
		lib1.setEditorial("LNS");
		
		Set<Libro> libros= new HashSet<>();
		libros.add(lib);
		libros.add(lib1);
		
		aut.setLibros(libros);
		aut1.setLibros(libros);
		
		Set<Autor> autores=new HashSet<>();
		autores.add(aut);
		//autores.add(aut1);
		
		
		lib.setAutores(autores);//aqui por esta cascade en autor
		lib1.setAutores(autores);
		  
		 // this.autorService.guardar(aut);
		 /* aut.setNombre("Augusto");
		  this.autorService.actualizar(aut);
		*/
	
		this.autorService.seleccionar(14);
	}

}