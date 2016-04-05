package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Client;

public interface ClientDAO {

	public void addClient(Client p);
	public void updateClient(Client p);
	public List<Client> listClients();
	public Client getClientById(int id);
	public void removeClient(int id);
}

