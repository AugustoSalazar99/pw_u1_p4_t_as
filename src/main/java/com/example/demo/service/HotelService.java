package com.example.demo.service;

import com.example.demo.repository.modelo.Hotel;

public interface HotelService {
	public void guardar(Hotel hotel);
	public void actulizar(Hotel hotel);
	public void eliminar(String id);
	public Hotel buscar(String id);

}
