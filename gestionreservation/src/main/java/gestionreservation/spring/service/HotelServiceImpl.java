package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.HotelDAO;
import gestionreservation.spring.model.Hotel;

@Service
public class HotelServiceImpl implements HotelService {
	
	private HotelDAO hotelDAO;

	public void setHotelDAO(HotelDAO hotelDAO) {
		this.hotelDAO = hotelDAO;
	}

	@Transactional
	public void addHotel(Hotel p) {
		this.hotelDAO.addHotel(p);
	}

	@Transactional
	public void updateHotel(Hotel p) {
		this.hotelDAO.updateHotel(p);
	}

	@Transactional
	public List<Hotel> listHotels() {
		return this.hotelDAO.listHotels();
	}

	@Transactional
	public Hotel getHotelById(int id) {
		return this.hotelDAO.getHotelById(id);
	}

	@Transactional
	public void removeHotel(int id) {
		this.hotelDAO.removeHotel(id);
	}

}

