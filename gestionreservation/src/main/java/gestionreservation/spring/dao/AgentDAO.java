package gestionreservation.spring.dao;

import java.util.List;

import gestionreservation.spring.model.Agent;

public interface AgentDAO {

	public void addAgent(Agent p);
	public void updateAgent(Agent p);
	public List<Agent> listAgents();
	public Agent getAgentById(int id);
	public void removeAgent(int id);
}
