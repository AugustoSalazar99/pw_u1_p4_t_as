package com.example.demo.repository.modelo;

import java.math.BigDecimal;

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
@Table(name="producto")
public class Producto {
	@GeneratedValue(generator = "seq_producto",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_producto",sequenceName = "seq_producto",allocationSize = 1)
	
	@Id
	@Column(name="prod_id")
	private Integer id;
	@Column(name="prod_nombre")
	private String nombre;
	@Column(name="prod_precio")
	private BigDecimal precio;
	
	@ManyToOne
	@JoinColumn(name="prod_id_fabricante")
	private Fabricante fabricante;

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

	

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante + "]";
	}

	
	
	

}
