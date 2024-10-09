package com.mysite.practice.message;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {

	// list 통로
	List<MessageDTO> getMessageListAll();
}
