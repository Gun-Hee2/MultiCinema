package com.one.multicinemaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.BbsDto;
import com.one.multicinemaback.dto.BbsParam;
import com.one.multicinemaback.service.BbsService;

@RestController
public class BbsController {
	
	@Autowired
	BbsService service;
	
	// 게시판 글 목록 불러오기
	@RequestMapping(value = "/bbslist", method = RequestMethod.GET)
	public List<BbsDto> bbslist(BbsParam param){
		System.out.println("BbsController bbslist()");
		
		System.out.println(param);
		
		int sn = param.getPage();  // 0, 1, 2...
		int start = sn * 10 + 1;   // 1, 11, 21...
		int end = (sn + 1) * 10;   // 10, 20, 30...
		
		param.setStart(start);
		param.setEnd(end);
		
		List<BbsDto> list = service.getbbslist(param);
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i).toString());
		}
		
		return list;
		
	}
	
	// 글의 총수 카운트
	@RequestMapping(value = "/bbscount", method = RequestMethod.GET)
	public int bbscount(BbsParam param) {
		System.out.println("BbsController bbscount()");
		
		return service.getbbscount(param);
	}
	
	// 글 쓰기
	@RequestMapping(value = "/bbswrite", method = RequestMethod.POST)
	public String bbswrite(BbsDto bbs) {
		System.out.println("BbsController bbswrite()");
		
		boolean b = service.writeBbs(bbs);
		
		if(b == true) {
			return "YES";
		}
		
		return "NO";
	}
	
	// 글 세부내용 전송하기
	@RequestMapping(value = "/bbsdetail", method = RequestMethod.GET)
	public BbsDto bbsdetail(int seq) {
		System.out.println("BbsController bbsdetail()");
		
		service.readcount(seq);
		
		BbsDto dto = service.getBbs(seq);
		
		return dto;
	}
	
	// 답글 쓰기
	@RequestMapping(value = "/bbsanswer", method = RequestMethod.POST)
	public String bbsanswer(BbsDto dto) {
		System.out.println("BbsController bbsanswer()");
		
		boolean up = service.answerup(dto);
		
		boolean in = service.answerin(dto);
		
		if(in == true) {
			return "YES";
		}
		
		return "NO";
			
	}
	
	// 글 수정하기
	@RequestMapping(value = "/bbsupdate", method = RequestMethod.POST)
	public String bbsupdate(BbsDto dto) {
		System.out.println("BbsController bbsupdate()");
		
		System.out.println(dto);
		
		boolean b = service.updateBbs(dto);
		
		if(b == true) {
			return "YES";
		}
		
		return "NO";
		
	}
	
	// 글 삭제하기
	@RequestMapping(value = "/bbsdelete", method = RequestMethod.POST)
	public String bbsdelete(BbsDto dto) {
		System.out.println("BbsController bbsdelete()");
		
		boolean b = service.deleteBbs(dto);
		
		if(b == true) {
			return "YES";
		}
		
		return "NO";
		
	}
	
	// 내가 작성한 글 
	@RequestMapping(value = "/mybbslist", method = RequestMethod.GET)
	public List<BbsDto> mybbslist(String id){
		System.out.println("BbsController mybbslist()");
		System.out.println(id);
		
		List<BbsDto> list  = service.mybbslist(id);
		System.out.println(list);
		return list;
		
	}

}




