package com.one.multicinemaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.SbPayDto;
import com.one.multicinemaback.dto.TicketDto;
import com.one.multicinemaback.dto.UserDto;
import com.one.multicinemaback.service.SbPayService;
import com.one.multicinemaback.service.SnackBarService;
import com.one.multicinemaback.service.TicketService;
import com.one.multicinemaback.service.UserService;

@RestController
public class MypageController {
	
	@Autowired
	TicketService tservice;
	
	@Autowired
	UserService uservice;
	
	@Autowired
	SnackBarService sservice;
	
	@Autowired
	SbPayService spservice;
	
	// 비밀번호 확인
	@RequestMapping(value = "/pwCheck", method = RequestMethod.POST)
	public String pwCheck(String id, String pw) {
		System.out.println("MypageController pwCheck()");

		UserDto user = uservice.getUser(id);
		
		if( user.getPw().equals(pw) ) {
			return "OK";
		} else {
			return "NG";
		}

	}
	
	// 회원정보 불러오기
	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	public UserDto getUser(String id) {
		System.out.println("MypageController getUser()");
		
		UserDto user = uservice.getUser(id);
		
		return user;

	}
	
	// 나의 정보 불러오기
		@RequestMapping(value = "/myProfile", method = RequestMethod.POST)
		public UserDto myProfile(String id) {
			System.out.println("MypageController myProfile()");
			
			UserDto user = uservice.getUser(id);
			
			return user;

		}
	
	// 회원정보 수정
	@RequestMapping(value = "/userUp", method = RequestMethod.POST)
	public UserDto pwUp(String pw, String email, String email1, String id){
		System.out.println("MypageController userUp()");

		if( pw.equals("")) {
		} else {
			uservice.pwUp(pw);
		}
		if(email1.equals("")) {
		} else {
			uservice.emailUp(email);
		}
		
		UserDto data = uservice.getUser(id);
		
		return data;
	}
	
	
	// 당일내역 리스트
	@RequestMapping(value = "/getTodayList", method = RequestMethod.GET)
	public List<TicketDto> getTodayList(String id) {
		System.out.println("MypageController getTodayList()");
		
		List<TicketDto> list = tservice.getTodayList(id);
		
		return list;
	}
	
	// 지난내역 리스트
	@RequestMapping(value = "/getPastList", method = RequestMethod.GET)
	public List<TicketDto> getPastList(String id) {
		System.out.println("MypageController getPastList()");

		List<TicketDto> list = tservice.getPastList(id);
		return list;
	}
	
	// My SbPay
	@RequestMapping(value = "/getSbPayList", method = RequestMethod.GET)
	public List<SbPayDto> getSbPayList(String id) {
		System.out.println("MypageController getSbPayList()");
		System.out.println(id);
		
		List<SbPayDto> list = spservice.getSbPayList(id);
		System.out.println(list);
		return list;
	}
}
