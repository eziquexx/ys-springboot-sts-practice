package com.mysite.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	@Autowired
	private MessageMapper messageMapper;
	
	// message list
	public List<Message> getMessageListAll() {
		return messageMapper.getMessageListAll();
	}
	
	// message detail. id값으로
	public Message getMessageDetail(Integer id) {
		return messageMapper.getMessageDetail(id);
	}
	
	// message create
	public void createMessate(Message message) {
		messageMapper.insertMessage(message);
	}
	
	// message list pagination
	public PageDTO getPagedData(int page, int size) {
		int offset = (page - 1) * size;
		
		List<Message> content = messageMapper.getMessagesWithPaging(offset, size);
		int totalElements = messageMapper.countTotal();
		int totalPages = (int) Math.ceil((double) totalElements / size);
		
		return new PageDTO(page, size, totalPages, totalElements, content);
	}
}
