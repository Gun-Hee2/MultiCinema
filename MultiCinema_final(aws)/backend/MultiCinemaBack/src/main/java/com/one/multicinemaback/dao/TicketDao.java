package com.one.multicinemaback.dao;

import java.util.List;  

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.TicketDto;

@Mapper
@Repository
public interface TicketDao {

	List<TicketDto> getTodayList(String id);
	List<TicketDto> getPastList(String id);
	List<TicketDto> getSeatList(int msnum);
	
	void inserttipay(TicketDto dto);
	TicketDto gettipay(TicketDto dto);
	boolean deltipay(TicketDto dto);
}
