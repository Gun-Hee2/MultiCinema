package com.one.multicinemaback.service;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.TicketDao;
import com.one.multicinemaback.dto.TicketDto;

@Service
@Transactional
public class TicketService {
	
	@Autowired
	TicketDao dao;
	
	// 영화 티켓 예약리스트 불러오기(마이 페이지)
	public List<TicketDto> getTodayList(String id){
		return dao.getTodayList(id);
	}
	
	// 영화 티켓 과거 예약리스트 불러오기(마이 페이지)
	public List<TicketDto> getPastList(String id){
		return dao.getPastList(id);
	}
	
	// 영화  좌석 불러오기(티켓 예약 페이지)
	public List<TicketDto> getSeatList(int msnum){
		return dao.getSeatList(msnum);
	}
	
	// 영화 티켓 카카오결제 내역 데이터 저장
	public void inserttipay(TicketDto dto) {
		dao.inserttipay(dto);
	}
	
	// 영화 티켓 카카오결제 내역 데이터 불러오기
	public TicketDto gettipay(TicketDto dto) {
		return dao.gettipay(dto);
	}
}
