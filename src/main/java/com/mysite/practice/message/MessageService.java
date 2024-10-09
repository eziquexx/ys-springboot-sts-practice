package com.mysite.practice.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	@Autowired
	private MessageMapper messageMapper;
	
	//MessageDetail - id
	public MessageDTO getMessage(Integer id) {
		return messageMapper.getMessageById(id);
	}
	
	// MessageListAll
	public List<MessageDTO> getMessageListAll() {
		return messageMapper.getMessageListAll();
	}
}
