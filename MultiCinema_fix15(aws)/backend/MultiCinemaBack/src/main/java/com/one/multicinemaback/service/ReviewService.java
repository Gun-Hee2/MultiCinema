package com.one.multicinemaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.ReviewDao;
import com.one.multicinemaback.dto.ReviewDto;

@Service
@Transactional
public class ReviewService {

	@Autowired
	ReviewDao dao;
	
	public List<ReviewDto> reviewList(int seq){
		return dao.reviewList(seq);
	}
	
	// 댓글 작성
	public int reviewInsert(ReviewDto review){
		return dao.reviewInsert(review);
	}
	
	// 댓글 수정 
	public int reviewUpdate(ReviewDto review){
		return dao.reviewUpdate(review);
	}
	
	// 댓글 삭제
	public int reviewDelete(int rnum){
		return dao.reviewDelete(rnum);
	}
}
