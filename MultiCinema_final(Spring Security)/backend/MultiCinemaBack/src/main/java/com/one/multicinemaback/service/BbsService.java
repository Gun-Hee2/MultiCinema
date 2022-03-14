package com.one.multicinemaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.BbsDao;
import com.one.multicinemaback.dto.BbsDto;
import com.one.multicinemaback.dto.BbsParam;

@Service
@Transactional
public class BbsService {
	
	@Autowired
	BbsDao dao;
	
	// 고객센터 글 목록 불러오기
	public List<BbsDto> getbbslist(BbsParam param) {
		return dao.getbbslist(param);
	}
	
	// 글의 총수 카운트
	public int getbbscount(BbsParam param) {
		return dao.getbbscount(param);
	}
	
	// 새 글 작성
	public boolean writeBbs(BbsDto bbs) {
		return dao.writeBbs(bbs);
	}
	
	// 글 조회수 올리기
	public void readcount(int seq) {
		dao.readcount(seq);
	}
	
	// 글 세부내용 불러오기
	public BbsDto getBbs(int seq) {
		return dao.getBbs(seq);
	}
	
	// 답글 글 순서 최신화
	public boolean answerup(BbsDto dto) {
		return dao.answerup(dto);
	}
	
	// 답글 작성
	public boolean answerin(BbsDto dto) {
		return dao.answerin(dto);
	}
	
	// 글 수정하기
	public boolean updateBbs(BbsDto dto) {
		return dao.updateBbs(dto);
	}
	
	// 글 삭제하기
	public boolean deleteBbs(BbsDto dto) {
		return dao.deleteBbs(dto);
	}
	
	// 내가 작성한 글 불러오기
	public List<BbsDto> mybbslist(String id) {
		return dao.mybbslist(id);
	}
	
}
