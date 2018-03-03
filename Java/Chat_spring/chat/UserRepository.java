package com.stry.chat;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	@PersistenceContext
	private EntityManager em;
	
public User getUserByName(String name){
	return (User)
	em.createNativeQuery("Select * from USERS where USER_Id = ?", User.class)
	.setParameter(1, name)
	.getSingleResult();
}

public void createUser(User user) {
	// TODO Auto-generated method stub
	
}

public List<User> findAll() {

	return 
			em.createNativeQuery("Select * from user", User.class)
			.getResultList();

}
}
