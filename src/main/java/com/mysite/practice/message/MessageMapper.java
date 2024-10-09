package com.mysite.practice.message;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {
	
	// detail. id
	MessageDTO getMessageById(Integer id);
	
	// list 통로
	List<MessageDTO> getMessageListAll();
	
	// insert message
	void insertMessage(MessageDTO message);
	
	// delete message
	void deleteMessage(Integer id);
}
