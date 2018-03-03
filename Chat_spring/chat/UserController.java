package com.stry.chat;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRemoteService userRemoteService;
	
	@RequestMapping(value ="/server/all", method = RequestMethod.GET)
	public List<String> getAllusers(){
	return userRemoteService.getAvailableContacts();
	
	}
	/*@RequestMapping(method = RequestMethod.GET)
	public List<User> getAllusers(){
	return userService.findAll();
	    }*/
	
//	@GetMapping("/{senderId}/{receiverId}/{body}")	
	@PostMapping()
	public User createUser(@RequestBody User user){
//		Message message = new Message();
//		message.setBody(body);
//		message.setSenderId(senderId);
//		message.setReceiverId(receiverId);
//		message.setCreated(new Date());
		user.setCreated(new Date());
		userService.create(user);
		return user;
		
	}
	
}
