package com.one.multicinemaback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.ReviewDto;

@Mapper
@Repository
public interface ReviewDao {
	// 댓글 개수
	public int reviewCount();
	
	// 댓글 목록
	public List<ReviewDto> reviewList(int seq); 
	
	// 댓글 작성
	public int reviewInsert(ReviewDto review); 
	
	// 댓글 수정 
	public int reviewUpdate(ReviewDto review); 
	
	// 댓글 삭제
	public int reviewDelete(int rnum);
	
}
