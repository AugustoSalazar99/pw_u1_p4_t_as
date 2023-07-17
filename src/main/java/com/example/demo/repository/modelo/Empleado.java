package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")

public class Empleado {
	@GeneratedValue(generator = "seq_empleado", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_empleado", sequenceName = "seq_empleado", allocationSize = 1)

	@Id
	@Column(name = "empl_id")
	private Integer id;
	@Column(name = "empl_sueldo")
	private BigDecimal sueldo;
	@Column(name = "empl_cargo")
	private String cargo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="universidad_id")
	private Universidad universidad;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", sueldo=" + sueldo + ", cargo=" + cargo + "]";
	}

	
	
}
