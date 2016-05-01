package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Role;

public interface RoleDAO {

	public void addRole(Role p);
	public void updateRole(Role p);
	public List<Role> listRoles();
	public Role getRoleById(int id);
	public void removeRole(int id);
}
