package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.ClientDAO;
import gestionreservation.spring.model.Client;


@Service
public class ClientServiceImpl implements ClientService {
	
	private ClientDAO clientDAO;

	public void setClientDAO(ClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}

	@Transactional
	public void addClient(Client p) {
		this.clientDAO.addClient(p);
	}

	@Transactional
	public void updateClient(Client p) {
		this.clientDAO.updateClient(p);
	}

	@Transactional
	public List<Client> listClients() {
		return this.clientDAO.listClients();
	}

	@Transactional
	public Client getClientById(int id) {
		return this.clientDAO.getClientById(id);
	}

	@Transactional
	public void removeClient(int id) {
		this.clientDAO.removeClient(id);
	}

}

