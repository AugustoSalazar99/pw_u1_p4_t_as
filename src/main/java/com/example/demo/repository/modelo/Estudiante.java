package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Estudiante {
	
	@GeneratedValue(generator = "seq_estudiante", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_estudiante", sequenceName = "seq_estudiante", allocationSize = 1)
	
	@Id
	@Column(name="estu_id")
	private Integer id;
	@Column(name="estu_nombre")
	private String nombre; 
	@Column(name="estu_edad")
	private String edad; 
	@Column(name="estu_especialidad")
	private String especialidad; 
	@Column(name="estu_fechaIngreso")
	private LocalDateTime fechaIngreso;
	
	//relacion
	@ManyToOne
	@JoinColumn(name="universidad_id")
	private Universidad universidad;

	//set y get
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", especialidad=" + especialidad
				+ ", fechaIngreso=" + fechaIngreso + ", universidad=" + universidad + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	
	

}
