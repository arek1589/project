package com.stry.chat;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.postgresql.translation.messages_bg;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {

	@PersistenceContext
	private EntityManager em;
	
	public void create(Message message) {
		em.persist(message);
	}
	
	    public List<Message> findAll() {
	    	
			return 
			em.createNativeQuery("Select * from message", Message.class)
			.getResultList();
	    	
//		        CriteriaBuilder cb = em.getCriteriaBuilder();
//		        CriteriaQuery<Message> cq = cb.createQuery(Message.class);
//		       Root<Message> rootEntry = cq.from(Message.class);
//		        CriteriaQuery<Message> all = cq.select(rootEntry);
//		       TypedQuery<Message> allQuery = em.createQuery(all);
//		        return allQuery.getResultList();
		   }
	
}
