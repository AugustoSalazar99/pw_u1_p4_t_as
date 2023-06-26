package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Fabricante;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.AutorService;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.FabricanteService;
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;
import com.example.demo.service.MatriculaService;
import com.example.demo.service.ProductoService;
import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.AutorRepository;
import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Producto;


@SpringBootApplication
public class Pa2U2P4AsJaApplication implements CommandLineRunner {

	@Autowired
	private FabricanteService fabricanteService;
	@Autowired
	private ProductoService productoService;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AsJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	/*	Fabricante fab=new Fabricante();
		fab.setNombre("KIA");
		fab.setUbicacion("av.Eloy Alfaro");
		
		Producto prod = new Producto();
		prod.setNombre("Seltos");
		prod.setPrecio(new BigDecimal(13000));
		
		// Establecer el objeto Fabricante en el Producto
		prod.setFabricante(fab);
		
		
		List<Producto> lisprod = new ArrayList<>();
		lisprod.add(prod);
		
		
		fab.setProductos(lisprod);
		
		this.fabricanteService.guarda(fab);
		*/
		//Query
		
		//System.out.println(this.productoService.reportePorPrecio(new BigDecimal(23000)));

		//System.out.println(this.productoService.reportePorNombre("Sonet"));
		
		
		//TypedQuery
		
		//System.out.println(this.productoService.reportePorNombreyPrecioTyped("Sonet", new BigDecimal(23000)));
		System.out.println(this.productoService.reportePorPrecioTyped(new BigDecimal(23000)));
		
		
		
	}

}