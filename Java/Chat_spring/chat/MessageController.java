package com.stry.chat;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	
	@Autowired
	private MessageRemoteService messageRemoteService;
	
	@RequestMapping(value="/servers/alls", method = RequestMethod.POST)
	public List<Message> createAllMessages(){
	return messageRemoteService.createMessage(message);
	    }
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Message> getAllMessages(){
	return messageService.findAll();
	    }
	
//	@GetMapping("/{senderId}/{receiverId}/{body}")	
	@PostMapping()
	public Message createMessage(@RequestBody Message message){
//		Message message = new Message();
//		message.setBody(body);
//		message.setSenderId(senderId);
//		message.setReceiverId(receiverId);
//		message.setCreated(new Date());
		message.setCreated(new Date());
		messageService.create(message);
		return message;
		
	}
}
