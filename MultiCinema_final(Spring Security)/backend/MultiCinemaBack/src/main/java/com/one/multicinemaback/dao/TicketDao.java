package com.one.multicinemaback.dao;

import java.util.List;  

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.TicketDto;

@Mapper
@Repository
public interface TicketDao {
        // 영화 티켓 예약리스트 불러오기
	List<TicketDto> getTodayList(String id);
	
	// 영화 티켓 과거 예약리스트 불러오기
	List<TicketDto> getPastList(String id);
	
	// 영화  좌석 불러오기
	List<TicketDto> getSeatList(int msnum);
	
	// 영화 티켓 카카오결제 내역 데이터 저장
	void inserttipay(TicketDto dto);
	
	// 영화 티켓 카카오결제 내역 데이터 불러오기
	TicketDto gettipay(TicketDto dto);
	
}
