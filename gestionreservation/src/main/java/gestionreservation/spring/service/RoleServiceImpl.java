package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.RoleDAO;
import gestionreservation.spring.model.Role;

@Service
public class RoleServiceImpl implements RoleService {
	
	private RoleDAO roleDAO;

	public void setRoleDAO(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

	@Transactional
	public void addRole(Role p) {
		this.roleDAO.addRole(p);
	}

	@Transactional
	public void updateRole(Role p) {
		this.roleDAO.updateRole(p);
	}

	@Transactional
	public List<Role> listRoles() {
		return this.roleDAO.listRoles();
	}

	@Transactional
	public Role getRoleById(int id) {
		return this.roleDAO.getRoleById(id);
	}

	@Transactional
	public void removeRole(int id) {
		this.roleDAO.removeRole(id);
	}

}

