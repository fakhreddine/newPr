package gestionreservation.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import gestionreservation.spring.model.Agent;

@Repository
public class AgentDAOImpl implements AgentDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(AgentDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addAgent(Agent p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Agent saved successfully, Agent Details="+p);
	}

	public void updateAgent(Agent p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Agent updated successfully, Agent Details="+p);
	}

	@SuppressWarnings("unchecked")

	public List<Agent> listAgents() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Agent> agentsList = session.createQuery("from Agent").list();
		for(Agent p : agentsList){
			logger.info("Agent List::"+p);
		}
		return agentsList;
	}

	public Agent getAgentById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Agent p = (Agent) session.load(Agent.class, new Integer(id));
		logger.info("Agent loaded successfully, Agent details="+p);
		return p;
	}

	public void removeAgent(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Agent p = (Agent) session.load(Agent.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Agent deleted successfully, agent details="+p);
	}

}
