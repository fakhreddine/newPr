package gestionreservation.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestionreservation.spring.dao.AgentDAO;
import gestionreservation.spring.model.Agent;

@Service
public class AgentServiceImpl implements AgentService {
	
	private AgentDAO agentDAO;

	public void setAgentDAO(AgentDAO agentDAO) {
		this.agentDAO = agentDAO;
	}

	@Transactional
	public void addAgent(Agent p) {
		this.agentDAO.addAgent(p);
	}

	@Transactional
	public void updateAgent(Agent p) {
		this.agentDAO.updateAgent(p);
	}

	@Transactional
	public List<Agent> listAgents() {
		return this.agentDAO.listAgents();
	}

	@Transactional
	public Agent getAgentById(int id) {
		return this.agentDAO.getAgentById(id);
	}

	@Transactional
	public void removeAgent(int id) {
		this.agentDAO.removeAgent(id);
	}

}

