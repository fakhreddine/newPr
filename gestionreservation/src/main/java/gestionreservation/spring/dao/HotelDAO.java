package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Hotel;

public interface HotelDAO {

	public void addHotel(Hotel p);
	public void updateHotel(Hotel p);
	public List<Hotel> listHotels();
	public Hotel getHotelById(int id);
	public void removeHotel(int id);
}

