package com.mysite.practice.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/messages")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	// messageDetail
	@GetMapping("/{id}")
	@ResponseBody
	public MessageDTO getMessage(@PathVariable("id") Integer id) {
		return messageService.getMessage(id);
	}
	
	
	// messageListPage
	@GetMapping
	public String getMessageList() {
		return "messageList";
	}
	
	// messageListAPI
	@GetMapping("/api")
	@ResponseBody
	public List<MessageDTO> getMessageListAll() {
		return messageService.getMessageListAll();
	}
	
}
