package com.one.multicinemaback.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.BbsDto;
import com.one.multicinemaback.dto.BbsParam;

@Mapper
@Repository
public interface BbsDao extends Serializable {
	
	// 고객센터 글 목록 불러오기
	List<BbsDto> getbbslist(BbsParam param);
	
	// 글의 총수 카운트
	int getbbscount(BbsParam param);
	
	// 새 글 작성
	boolean writeBbs(BbsDto bbs);
	
	// 글 세부내용 불러오기
	BbsDto getBbs(int seq);
	
	// 글 조회수 
	void readcount(int seq);
	
	// 답글 글 순서 최신화
	boolean answerup(BbsDto dto);
	
	// 답글 작성
	boolean answerin(BbsDto dto);
	
	// 글 수정하기
	boolean updateBbs(BbsDto dto);
	
	// 글 삭제하기
	boolean deleteBbs(BbsDto dto);
	
	// 내가 작성한 글  
	List<BbsDto> mybbslist(String id);
}
