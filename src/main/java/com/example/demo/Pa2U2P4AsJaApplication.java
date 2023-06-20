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
		Hotel hot = new Hotel();
		hot.setNombre("Hilton colon");
		hot.setDireccion("av.Patria");
		
		Habitacion hab = new Habitacion();
		hab.setNumero("A1");
		hab.setValor(new BigDecimal(100));
		
		List<Habitacion> listhab=new ArrayList<>();
		
		listhab.add(hab);
		
		hot.setHabitaciones(listhab);
				
		//this.hotelService.guardar(hot);
		/*hot.setNombre("Hotel Quito");
		this.hotelService.actulizar(hot);
		*/
		//this.hotelService.eliminar(5);
		this.hotelService.buscar(6);
		//System.out.println(this.hotelService.buscar(6));
		
	}

}