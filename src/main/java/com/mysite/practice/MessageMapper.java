package com.mysite.practice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {

	List<Message> getMessageListAll();
	Message getMessageDetail(Integer id);
	void insertMessage(Message message);
}
