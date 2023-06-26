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
@Table(name="fabricante")
public class Fabricante {
	@GeneratedValue(generator = "seq_fabricante", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_fabricante",sequenceName = "seq_fabricante",allocationSize = 1)
	
	
	
	@Id
	@Column(name="fab_id")
	private Integer id;
	@Column(name="fab_nombre")
	private String nombre;
	@Column(name="fab_ubicacion")
	private String ubicacion;
	
	@OneToMany(mappedBy ="fabricante",cascade = CascadeType.ALL)
	private List<Producto> productos;
	
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
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	

}
