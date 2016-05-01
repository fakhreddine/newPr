package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Admin;

public interface AdminDAO {

	public void addAdmin(Admin p);
	public void updateAdmin(Admin p);
	public List<Admin> listAdmins();
	public Admin getAdminById(int id);
	public void removeAdmin(int id);
}
