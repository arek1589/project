package com.stry.chat;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MessageService {

	@Autowired
	MessageRepository messageRepository;
	@Autowired
	UserService userService;
	@Transactional 
	public void create(Message message){

		messageRepository.create(message);
		
		
	}
	
	@Transactional
	   public List<Message> findAll(){
		       return messageRepository.findAll();
		   }
}
