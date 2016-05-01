package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.AdminDAO;
import gestionreservation.spring.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	private AdminDAO adminDAO;

	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}

	@Transactional
	public void addAdmin(Admin p) {
		this.adminDAO.addAdmin(p);
	}

	@Transactional
	public void updateAdmin(Admin p) {
		this.adminDAO.updateAdmin(p);
	}

	@Transactional
	public List<Admin> listAdmins() {
		return this.adminDAO.listAdmins();
	}

	@Transactional
	public Admin getAdminById(int id) {
		return this.adminDAO.getAdminById(id);
	}

	@Transactional
	public void removeAdmin(int id) {
		this.adminDAO.removeAdmin(id);
	}

}

