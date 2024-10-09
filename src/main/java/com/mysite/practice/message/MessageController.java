package com.mysite.practice.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	// messageDetail
	@GetMapping("/messages/{id}")
	public String getMessage(@PathVariable("id") Integer id, Model model) {
		MessageDTO message = messageService.getMessage(id);
		model.addAttribute("msg", message);
		return "messageDetail";
	}
	
	// messageListPage
	@GetMapping("/messages")
	public String getMessageList() {
		return "messageList";
	}
	
	// messageListAPI
	@GetMapping("/messages/api")
	@ResponseBody
	public List<MessageDTO> getMessageListAll() {
		return messageService.getMessageListAll();
	}
	
	// messageInsert
	@GetMapping("/create")
	public String getMessageCreate() {
		return "messageCreate";
	}
	
	
}
