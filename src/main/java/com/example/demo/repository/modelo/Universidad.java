package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Universidad {

	
	@GeneratedValue(generator = "seq_universidad",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_universidad",sequenceName = "seq_universidad",allocationSize = 1)
	
	@Id
	@Column(name="univ_id")
	private Integer id;
	@Column(name="univ_nombre")
	private String nombre;
	@Column(name="univ_ubicacion")
	private String ubicación;
	@Column(name="univ_fundacion")
	private String fundación;    
	@Column(name="univ_")
	private Double pension;
	
	//relacion
	@OneToMany(mappedBy = "universidad",cascade = CascadeType.ALL)
	private List<Estudiante> Estudiantes;

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

	public String getUbicación() {
		return ubicación;
	}

	public void setUbicación(String ubicación) {
		this.ubicación = ubicación;
	}

	public String getFundación() {
		return fundación;
	}

	public void setFundación(String fundación) {
		this.fundación = fundación;
	}

	public Double getPension() {
		return pension;
	}

	public void setPension(Double pension) {
		this.pension = pension;
	}

	public List<Estudiante> getEstudiantes() {
		return Estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		Estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		return "Universidad [id=" + id + ", nombre=" + nombre + ", ubicación=" + ubicación + ", fundación=" + fundación
				+ ", pension=" + pension + ", Estudiantes=" + Estudiantes + "]";
	}

	
	
	
	
}
