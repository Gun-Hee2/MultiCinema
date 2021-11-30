package com.one.multicinemaback.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.MovieScheduleDto;
import com.one.multicinemaback.dto.TicketDto;
import com.one.multicinemaback.service.MovieScheduleService;
import com.one.multicinemaback.service.TicketService;

@RestController
public class MovieScheduleController {
	
	@Autowired
	MovieScheduleService mservice;
	
	@Autowired
	TicketService tservice;
	
	// 영화 제목
	@RequestMapping(value = "/mtitle", method = RequestMethod.POST)
	public List<MovieScheduleDto> mtitle(String sdate) {
		System.out.println("MovieScheduleController mtitle()");
		System.out.println(sdate);
		
		List<MovieScheduleDto> list = mservice.mtitle(sdate);
		System.out.println(list);
		
		
		return list;
	}
	
	// 상영 시간
	@RequestMapping(value = "/mtime", method = RequestMethod.POST)
	public List<MovieScheduleDto> mtime(String title) {
		System.out.println("MovieScheduleController mtime()");
		// System.out.println(title);
		
		List<MovieScheduleDto> list = mservice.mtime(title);
		System.out.println(list);
		
		return list;
	}
	
	// 영화제목, 날짜에 따른 좌석
		@RequestMapping(value = "/seat", method = RequestMethod.POST)
		public List<TicketDto> seat(int msnum) {
			System.out.println("MovieScheduleController seat()");
			System.out.println(msnum);
			
			List<TicketDto> list = tservice.getSeatList(msnum);
			System.out.println(list);
			
			return list;
		}
		
	// msnum 검색한 영화정보
		@RequestMapping(value = "/mmsnum", method = RequestMethod.POST)
		public List<MovieScheduleDto> mmsnum(int msnum) {
			System.out.println("MovieScheduleController mmsnum()");
			System.out.println(msnum);
			
			List<MovieScheduleDto> list = mservice.mmsnum(msnum);
			System.out.println(list);
			
			return list;
		}

	
}
