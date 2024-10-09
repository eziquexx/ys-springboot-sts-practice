package com.mysite.practice.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	@Autowired
	private MessageMapper messageMapper;
	
	public List<MessageDTO> getMessageListAll() {
		return messageMapper.getMessageListAll();
	}
}
