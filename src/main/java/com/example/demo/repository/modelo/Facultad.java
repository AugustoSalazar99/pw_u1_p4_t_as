package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import org.springframework.transaction.annotation.Transactional;

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
public class Facultad {
	
	@GeneratedValue(generator = "seq_facultad",strategy =GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_facultad",sequenceName = "seq_facultad",allocationSize = 1)
	
	
	@Id
	@Column(name="fac_id")
	private Integer id;
	@Column(name="fac_nombre")
	private String nombre;
	@Column(name="fac_decano")
	private String decano;
	@Column(name="fac_numeroEstudiantes")
	private BigDecimal numeroEstudiantes;
	
	@ManyToOne
	@JoinColumn(name="universidad_id")
	private Universidad universidad;

	
	//set y get
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

	public String getDecano() {
		return decano;
	}

	public void setDecano(String decano) {
		this.decano = decano;
	}

	public BigDecimal getNumeroEstudiantes() {
		return numeroEstudiantes;
	}

	public void setNumeroEstudiantes(BigDecimal numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	@Override
	public String toString() {
		return "Facultad [id=" + id + ", nombre=" + nombre + ", decano=" + decano + ", numeroEstudiantes="
				+ numeroEstudiantes + "]";
	}

}

	


