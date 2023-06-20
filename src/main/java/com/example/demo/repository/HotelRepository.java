package com.example.demo.repository;

import com.example.demo.repository.modelo.Hotel;

public interface HotelRepository {
	
	public void insertar(Hotel hotel);
	public void actualizar(Hotel hotel);
	public void eliminar(String id);
	public Hotel buscar (String id);
	

}
