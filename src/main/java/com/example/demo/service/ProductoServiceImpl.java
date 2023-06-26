package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ProductoRepository;
import com.example.demo.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepository.insertar(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepository.actualizar(producto);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.productoRepository.eliminar(id);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.productoRepository.buscar(id);
	}

	@Override
	public Producto reportePorPrecio(BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.productoRepository.seleccionarPorPrecio(precio);
	}

	@Override
	public List<Producto> reportePorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.productoRepository.seleccionarPorNombre(nombre);
	}

	@Override
	public List <Producto> reportePorPrecioTyped(BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.productoRepository.seleccionarPorPrecioTyped(precio);
	}

	@Override
	public Producto reportePorNombreyPrecioTyped(String nombre, BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.productoRepository.seleccionarPorNombreyPrecioTyped(nombre, precio);
	}

	

}
