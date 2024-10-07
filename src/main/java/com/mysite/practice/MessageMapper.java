package com.mysite.practice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MessageMapper {

	List<Message> getMessageListAll();
	Message getMessageDetail(Integer id);
	void insertMessage(Message message);
	
	// pagination
	List<Message> getMessagesWithPaging(@Param("size") Integer size, @Param("offset") Integer offset);
	int countTotal();
}
