package com.stry.chat;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

@Service
public class MessageRemoteService extends AbstractRemoteService {

	public Message createMessage(Message message){
        HttpHeaders headers = getDefaultHeaders();
        RequestEntity request = new RequestEntity(message, headers, HttpMethod.POST, prepareUrl("/api/message"));
        return restTemplate.exchange(request, Message.class).getBody();
}
}
