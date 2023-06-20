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
		Ciudadano ciu = new Ciudadano();

		ciu.setNombre("Jairo");
		ciu.setApellido("Salazar");
		ciu.setCedula("12431243");

		Empleado empl = new Empleado();

		empl.setCuidadano(ciu);
		empl.setCargo("jefe");
		empl.setSueldo(new BigDecimal(1000));
		ciu.setEmpleado(empl);
		/// no se hace this.empleadoService.guardar(empl);

		//this.ciudadanoService.guardar(ciu);
	/*	ciu.setNombre("Yajairo");
		ciu.setCedula("9823651234");
		this.ciudadanoService.actualizar(ciu);
	*/
		//this.ciudadanoService.borrar(3);
		
		
System.out.println(this.ciudadanoService.buscar(5));
	}

}
